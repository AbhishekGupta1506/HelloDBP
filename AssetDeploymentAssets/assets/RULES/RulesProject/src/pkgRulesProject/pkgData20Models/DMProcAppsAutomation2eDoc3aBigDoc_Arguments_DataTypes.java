package pkgRulesProject.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
import java.util.Date;
@IRuleAnnotation(RuleProjectName="RulesProject",DataModelName="ProcAppsAutomation2eDoc3aBigDoc_Arguments_DataTypes",EventTypeName="") public class DMProcAppsAutomation2eDoc3aBigDoc_Arguments_DataTypes extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private Integer slotdtInteger;
  private Double slotdtFloat;
  private Double slotdtDouble;
  private Long slotdtLong;
  private Character slotdtChar;
  private Date slotdtDate;
  private Boolean slotdtBoolean;
  @IDataAnnotation(OriginalFieldName="dtInteger",FieldName="slotdtInteger",SlotKey="/dtInteger;3.6;0",Position=0,CameFromFloat=false) public Integer getSlotdtInteger(){
    return this.slotdtInteger;
  }
  @IDataAnnotation(OriginalFieldName="dtInteger",FieldName="slotdtInteger",SlotKey="/dtInteger;3.6;0",Position=0,CameFromFloat=false) public void setSlotdtInteger(  Integer paramdtInteger){
    this.slotdtInteger=paramdtInteger;
  }
  @IDataAnnotation(OriginalFieldName="dtInteger",FieldName="slotdtInteger",SlotKey="/dtInteger;3.6;0",Position=0,CameFromFloat=false) public void setSlotdtInteger(  String paramdtInteger){
    if (paramdtInteger != null) {
      this.slotdtInteger=new Integer(paramdtInteger);
    }
 else {
      this.slotdtInteger=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtInteger",FieldName="slotdtInteger",SlotKey="/dtInteger;3.6;0",Position=0,CameFromFloat=false) public void setSlotdtInteger(  Double paramdtInteger){
    if (paramdtInteger != null) {
      this.slotdtInteger=paramdtInteger.intValue();
    }
 else {
      this.slotdtInteger=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtFloat",FieldName="slotdtFloat",SlotKey="/dtFloat;3.5;0",Position=1,CameFromFloat=true) public Double getSlotdtFloat(){
    return this.slotdtFloat;
  }
  @IDataAnnotation(OriginalFieldName="dtFloat",FieldName="slotdtFloat",SlotKey="/dtFloat;3.5;0",Position=1,CameFromFloat=true) public void setSlotdtFloat(  Double paramdtFloat){
    this.slotdtFloat=paramdtFloat;
  }
  @IDataAnnotation(OriginalFieldName="dtFloat",FieldName="slotdtFloat",SlotKey="/dtFloat;3.5;0",Position=1,CameFromFloat=true) public void setSlotdtFloat(  String paramdtFloat){
    if (paramdtFloat != null) {
      this.slotdtFloat=new Double(paramdtFloat);
    }
 else {
      this.slotdtFloat=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtFloat",FieldName="slotdtFloat",SlotKey="/dtFloat;3.5;0",Position=1,CameFromFloat=true) public void setSlotdtFloat(  Long paramdtFloat){
    if (paramdtFloat != null) {
      this.slotdtFloat=new Double(paramdtFloat);
    }
 else {
      this.slotdtFloat=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtDouble",FieldName="slotdtDouble",SlotKey="/dtDouble;3.4;0",Position=2,CameFromFloat=false) public Double getSlotdtDouble(){
    return this.slotdtDouble;
  }
  @IDataAnnotation(OriginalFieldName="dtDouble",FieldName="slotdtDouble",SlotKey="/dtDouble;3.4;0",Position=2,CameFromFloat=false) public void setSlotdtDouble(  Double paramdtDouble){
    this.slotdtDouble=paramdtDouble;
  }
  @IDataAnnotation(OriginalFieldName="dtDouble",FieldName="slotdtDouble",SlotKey="/dtDouble;3.4;0",Position=2,CameFromFloat=false) public void setSlotdtDouble(  String paramdtDouble){
    if (paramdtDouble != null) {
      this.slotdtDouble=new Double(paramdtDouble);
    }
 else {
      this.slotdtDouble=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtDouble",FieldName="slotdtDouble",SlotKey="/dtDouble;3.4;0",Position=2,CameFromFloat=false) public void setSlotdtDouble(  Long paramdtDouble){
    if (paramdtDouble != null) {
      this.slotdtDouble=new Double(paramdtDouble);
    }
 else {
      this.slotdtDouble=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtLong",FieldName="slotdtLong",SlotKey="/dtLong;3.7;0",Position=3,CameFromFloat=false) public Long getSlotdtLong(){
    return this.slotdtLong;
  }
  @IDataAnnotation(OriginalFieldName="dtLong",FieldName="slotdtLong",SlotKey="/dtLong;3.7;0",Position=3,CameFromFloat=false) public void setSlotdtLong(  Long paramdtLong){
    this.slotdtLong=paramdtLong;
  }
  @IDataAnnotation(OriginalFieldName="dtLong",FieldName="slotdtLong",SlotKey="/dtLong;3.7;0",Position=3,CameFromFloat=false) public void setSlotdtLong(  String paramdtLong){
    if (paramdtLong != null) {
      this.slotdtLong=new Long(paramdtLong);
    }
 else {
      this.slotdtLong=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtLong",FieldName="slotdtLong",SlotKey="/dtLong;3.7;0",Position=3,CameFromFloat=false) public void setSlotdtLong(  Double paramdtLong){
    if (paramdtLong != null) {
      this.slotdtLong=paramdtLong.longValue();
    }
 else {
      this.slotdtLong=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="dtChar",FieldName="slotdtChar",SlotKey="/dtChar;3.3;0",Position=4,CameFromFloat=false) public Character getSlotdtChar(){
    return this.slotdtChar;
  }
  @IDataAnnotation(OriginalFieldName="dtChar",FieldName="slotdtChar",SlotKey="/dtChar;3.3;0",Position=4,CameFromFloat=false) public void setSlotdtChar(  Character paramdtChar){
    this.slotdtChar=paramdtChar;
  }
  @IDataAnnotation(OriginalFieldName="dtChar",FieldName="slotdtChar",SlotKey="/dtChar;3.3;0",Position=4,CameFromFloat=false) public void setSlotdtChar(  String paramdtChar){
    if (paramdtChar == null) {
      this.slotdtChar=null;
      return;
    }
    if (paramdtChar.length() == 1) {
      this.slotdtChar=new Character(paramdtChar.charAt(0));
    }
  }
  @IDataAnnotation(OriginalFieldName="dtDate",FieldName="slotdtDate",SlotKey="/dtDate;3.9;0",Position=5,CameFromFloat=false) public Date getSlotdtDate(){
    return this.slotdtDate;
  }
  @IDataAnnotation(OriginalFieldName="dtDate",FieldName="slotdtDate",SlotKey="/dtDate;3.9;0",Position=5,CameFromFloat=false) public void setSlotdtDate(  Date paramdtDate){
    this.slotdtDate=paramdtDate;
  }
  @IDataAnnotation(OriginalFieldName="dtBoolean",FieldName="slotdtBoolean",SlotKey="/dtBoolean;3.1;0",Position=6,CameFromFloat=false) public Boolean getSlotdtBoolean(){
    return this.slotdtBoolean;
  }
  @IDataAnnotation(OriginalFieldName="dtBoolean",FieldName="slotdtBoolean",SlotKey="/dtBoolean;3.1;0",Position=6,CameFromFloat=false) public void setSlotdtBoolean(  Boolean paramdtBoolean){
    this.slotdtBoolean=paramdtBoolean;
  }
}
