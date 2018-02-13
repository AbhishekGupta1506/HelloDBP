package pkgTestRuleProject1.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="TestRuleProject1",DataModelName="DM1",EventTypeName="") public class DMDM1 extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotname;
  private String slottype;
  @IDataAnnotation(OriginalFieldName="name",FieldName="slotname",SlotKey="/name;1;0",Position=0,CameFromFloat=false) public String getSlotname(){
    return this.slotname;
  }
  @IDataAnnotation(OriginalFieldName="name",FieldName="slotname",SlotKey="/name;1;0",Position=0,CameFromFloat=false) public void setSlotname(  String paramname){
    this.slotname=paramname;
  }
  @IDataAnnotation(OriginalFieldName="type",FieldName="slottype",SlotKey="/type;1;0",Position=1,CameFromFloat=false) public String getSlottype(){
    return this.slottype;
  }
  @IDataAnnotation(OriginalFieldName="type",FieldName="slottype",SlotKey="/type;1;0",Position=1,CameFromFloat=false) public void setSlottype(  String paramtype){
    this.slottype=paramtype;
  }
}
