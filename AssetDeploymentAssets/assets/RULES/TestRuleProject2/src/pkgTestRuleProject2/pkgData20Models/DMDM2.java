package pkgTestRuleProject2.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="TestRuleProject2",DataModelName="DM2",EventTypeName="") public class DMDM2 extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotname;
  @IDataAnnotation(OriginalFieldName="name",FieldName="slotname",SlotKey="/name;1;0",Position=0,CameFromFloat=false) public String getSlotname(){
    return this.slotname;
  }
  @IDataAnnotation(OriginalFieldName="name",FieldName="slotname",SlotKey="/name;1;0",Position=0,CameFromFloat=false) public void setSlotname(  String paramname){
    this.slotname=paramname;
  }
}
