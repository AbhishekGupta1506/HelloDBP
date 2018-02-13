package pkgRulesProject.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RulesProject",DataModelName="BigDoc",EventTypeName="") public class DMBigDoc extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private DMProcAppsAutomation2eDoc3aBigDoc_LaunchData slotLaunchData;
  private DMProcAppsAutomation2eDoc3aBigDoc_Arguments slotArguments;
  private DMpub2epublish_envelope slot_env;
  @IDataAnnotation(OriginalFieldName="LaunchData",FieldName="slotLaunchData",SlotKey="/LaunchData;2;0",Position=0,CameFromFloat=false) public DMProcAppsAutomation2eDoc3aBigDoc_LaunchData getSlotLaunchData(){
    return this.slotLaunchData;
  }
  @IDataAnnotation(OriginalFieldName="LaunchData",FieldName="slotLaunchData",SlotKey="/LaunchData;2;0",Position=0,CameFromFloat=false) public void setSlotLaunchData(  DMProcAppsAutomation2eDoc3aBigDoc_LaunchData paramLaunchData){
    this.slotLaunchData=paramLaunchData;
  }
  @IDataAnnotation(OriginalFieldName="Arguments",FieldName="slotArguments",SlotKey="/Arguments;2;0",Position=1,CameFromFloat=false) public DMProcAppsAutomation2eDoc3aBigDoc_Arguments getSlotArguments(){
    return this.slotArguments;
  }
  @IDataAnnotation(OriginalFieldName="Arguments",FieldName="slotArguments",SlotKey="/Arguments;2;0",Position=1,CameFromFloat=false) public void setSlotArguments(  DMProcAppsAutomation2eDoc3aBigDoc_Arguments paramArguments){
    this.slotArguments=paramArguments;
  }
  @IDataAnnotation(OriginalFieldName="_env",FieldName="slot_env",SlotKey="/_env;4;0;pub.publish:envelope",Position=2,CameFromFloat=false) public DMpub2epublish_envelope getSlot_env(){
    return this.slot_env;
  }
  @IDataAnnotation(OriginalFieldName="_env",FieldName="slot_env",SlotKey="/_env;4;0;pub.publish:envelope",Position=2,CameFromFloat=false) public void setSlot_env(  DMpub2epublish_envelope param_env){
    this.slot_env=param_env;
  }
}
