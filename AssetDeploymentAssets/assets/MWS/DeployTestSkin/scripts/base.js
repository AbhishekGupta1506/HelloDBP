/**
 * @fileoverview
 * Scripts to enable skin look-and-feel.
 */

Event.observe(window, "load", function(event) {
    var ff2 = (function(){ var a = navigator.userAgent.match(/Gecko\/(\d{4})/); return (a && parseInt(a[1]) < 2008); })();

    // fix footer
    var footer = $("footer"), nonFooter = $("nonFooter");
    if (footer && nonFooter) {
        nonFooter.style.paddingBottom = footer.offsetHeight + "px";
        if (CAF.ie && CAF.ie < 7)
            footer.style.paddingTop = nonFooter.style.paddingBottom;
    }

    var refresh = function(event) {
        var element = event.target || document;

        // update buttons to use portlet-form-button, fields to use portlet-form-input-field
        for (var i = 0, input, inputs = element.getElementsByTagName("input"); input = inputs[i]; i++) {
            switch (input.type) {
                case "button":
                case "submit":
                case "reset":
                    if (!/portlet-form-button/.test(input.className))
                        Element.addClassName(input, "portlet-form-button");

                    // help ie with button hovers
                    if (CAF.ie) {
                        Event.observe(input, "mouseover", wm_skin_pearls.buttonOver);
                        Event.observe(input, "mouseout", wm_skin_pearls.buttonOut);
                    }
                    break;
                case "checkbox":
                    Element.addClassName(input, "caf-checkbox");
                    break;
                case "radio":
                    Element.addClassName(input, "caf-radio");
                    break;
                case "file":
                case "hidden":
                case "image":
                   break;
                default:
                    if (!/portlet-form-input-field/.test(input.className))
                        Element.addClassName(input, "portlet-form-input-field");
            }
        }

        // help ie with button hovers
        if (CAF.ie)
            for (var i = 0, input, inputs = element.getElementsByTagName("button"); input = inputs[i]; i++) {
                Event.observe(input, "mouseover", wm_skin_pearls.buttonOver);
                Event.observe(input, "mouseout", wm_skin_pearls.buttonOut);
            }
    };
    refresh(event);
    Event.Custom.addListener("CAF.Update", refresh);

    if (CAF.ie) {
        // check for disabled/enabled buttons
        setInterval(function() {
            for (var i = 0, input, inputs = document.getElementsByTagName("input"); input = inputs[i]; i++)
                if (!input.type || input.type == "text") {
                    if (input.disabled) {
                        if (!/caf-input-disabled/.test(input.className))
                            input.className += " caf-input-disabled";
                    } else {
                        if (/caf-input-disabled/.test(input.className))
                            input.className = input.className.replace(/\s*caf-input-disabled/, "");
                    }
                } else if (input.type == "button" || input.type == "submit") {
                    if (input.disabled) {
                        if (!/caf-button-disabled/.test(input.className))
                            input.className += " caf-button-disabled";
                    } else {
                        if (/caf-button-disabled/.test(input.className))
                            input.className = input.className.replace(/\s*caf-button-disabled/, "");
                    }
                }
            for (var i = 0, input, inputs = document.getElementsByTagName("button"); input = inputs[i]; i++) {
                if (input.disabled) {
                    if (!/caf-button-disabled/.test(input.className))
                        input.className += " caf-button-disabled";
                } else {
                    if (/caf-button-disabled/.test(input.className))
                        input.className = input.className.replace(/\s*caf-button-disabled/, "");
                }
            }
        }, 2000);
    }

    var rtl = Element.getStyle(document.body, "direction") == "rtl";
    var offRight = -1;

    // do special popup sub-menu hovers
    for (var i = 0, span, spans = document.getElementsByTagName("span"); span = spans[i]; i++) {
        if (/caf-popup-menu-has-submenu/.test(span.className)) {
            var link = wm_skin_pearls._findNotSpan(span);
            Event.observe(link, "mouseover", wm_skin_pearls.menuItemOver);
            Event.observe(link, "mouseout", wm_skin_pearls.menuItemOut);

            // hack to workaround ie's buggy relative positioning with mixed-directionality
            // calculate right-offset for sub-menu icon in second-level nav menu
            // and use that offset for sub-menu icon in popup menus
            if (!CAF.ie || !rtl) continue;

            // skip first sub-menu (top-level), use offset for second-level nav menus
            if (offRight < 0)
                offRight++;
            else if (!offRight)
                offRight = span.parentNode.offsetWidth - (span.offsetLeft + span.offsetWidth);
            
            // correct positioning in nav popup menus
            if (/caf-bidi-wrapper/.test(span.parentNode.className)) {
                span.style.backgroundPosition = (CAF.ie >= 7 ? "top right" : "100% 20%");
                span.style.right = offRight + "px";
            }
        }
    }
    
    // fix sortable table-header margins just for ff 2
    if (ff2)
        CAF.appendStyle(".portlet-section-header a.caf-sortable { margin-" + (rtl ? "left" : "right") + ": 10px; }");
});

var wm_skin_pearls = {
    buttonOver: function(event) {
        var element = Event.element(event);
        var button = wm_skin_pearls._findButton(element);
        Element.addClassName(button, "caf-button-hover");
    },
    buttonOut: function(event) {
        var element = Event.element(event);
        var button = wm_skin_pearls._findButton(element);
        Element.removeClassName(button, "caf-button-hover");
    },
    _findButton: function(element) {
        if (!/input/i.test(element.tagName)) {
            var button = element.parentNode;
            while (button && !/button/i.test(button.tagName))
                button = button.parentNode;
            if (button)
                return button;
        }
        return element;
    },
    menuItemOver: function(event) {
        var element = wm_skin_pearls._findNotSpan(Event.element(event));
        Element.addClassName(element, "PopupMenuItemHover");
    },
    menuItemOut: function(event) {
        var element = wm_skin_pearls._findNotSpan(Event.element(event));
        Element.removeClassName(element, "PopupMenuItemHover");
    },
    _findNotSpan: function(element) {
        while (/span/i.test(element.tagName))
            element = element.parentNode;
        return element;
    }
};
