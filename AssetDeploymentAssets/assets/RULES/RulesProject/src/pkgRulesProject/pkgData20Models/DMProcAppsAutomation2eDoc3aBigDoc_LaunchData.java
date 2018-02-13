package pkgRulesProject.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RulesProject",DataModelName="ProcAppsAutomation2eDoc3aBigDoc_LaunchData",EventTypeName="") public class DMProcAppsAutomation2eDoc3aBigDoc_LaunchData extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotStartFilter;
  private String slotExecutedBy;
  private String slotOther;
  @IDataAnnotation(OriginalFieldName="StartFilter",FieldName="slotStartFilter",SlotKey="/StartFilter;1;0",Position=0,CameFromFloat=false) public String getSlotStartFilter(){
    return this.slotStartFilter;
  }
  @IDataAnnotation(OriginalFieldName="StartFilter",FieldName="slotStartFilter",SlotKey="/StartFilter;1;0",Position=0,CameFromFloat=false) public void setSlotStartFilter(  String paramStartFilter){
    this.slotStartFilter=paramStartFilter;
  }
  @IDataAnnotation(OriginalFieldName="ExecutedBy",FieldName="slotExecutedBy",SlotKey="/ExecutedBy;1;0",Position=1,CameFromFloat=false) public String getSlotExecutedBy(){
    return this.slotExecutedBy;
  }
  @IDataAnnotation(OriginalFieldName="ExecutedBy",FieldName="slotExecutedBy",SlotKey="/ExecutedBy;1;0",Position=1,CameFromFloat=false) public void setSlotExecutedBy(  String paramExecutedBy){
    this.slotExecutedBy=paramExecutedBy;
  }
  @IDataAnnotation(OriginalFieldName="Other",FieldName="slotOther",SlotKey="/Other;1;0",Position=2,CameFromFloat=false) public String getSlotOther(){
    return this.slotOther;
  }
  @IDataAnnotation(OriginalFieldName="Other",FieldName="slotOther",SlotKey="/Other;1;0",Position=2,CameFromFloat=false) public void setSlotOther(  String paramOther){
    this.slotOther=paramOther;
  }
}
