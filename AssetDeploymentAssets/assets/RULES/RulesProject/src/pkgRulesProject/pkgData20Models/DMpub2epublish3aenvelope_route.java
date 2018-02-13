package pkgRulesProject.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
import java.util.Date;
@IRuleAnnotation(RuleProjectName="RulesProject",DataModelName="pub2epublish3aenvelope_route",EventTypeName="") public class DMpub2epublish3aenvelope_route extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotbroker;
  private Date slotrecvTime;
  private Date slotenqueueTime;
  @IDataAnnotation(OriginalFieldName="broker",FieldName="slotbroker",SlotKey="/broker;1;0",Position=0,CameFromFloat=false) public String getSlotbroker(){
    return this.slotbroker;
  }
  @IDataAnnotation(OriginalFieldName="broker",FieldName="slotbroker",SlotKey="/broker;1;0",Position=0,CameFromFloat=false) public void setSlotbroker(  String parambroker){
    this.slotbroker=parambroker;
  }
  @IDataAnnotation(OriginalFieldName="recvTime",FieldName="slotrecvTime",SlotKey="/recvTime;3.9;0",Position=1,CameFromFloat=false) public Date getSlotrecvTime(){
    return this.slotrecvTime;
  }
  @IDataAnnotation(OriginalFieldName="recvTime",FieldName="slotrecvTime",SlotKey="/recvTime;3.9;0",Position=1,CameFromFloat=false) public void setSlotrecvTime(  Date paramrecvTime){
    this.slotrecvTime=paramrecvTime;
  }
  @IDataAnnotation(OriginalFieldName="enqueueTime",FieldName="slotenqueueTime",SlotKey="/enqueueTime;3.9;0",Position=2,CameFromFloat=false) public Date getSlotenqueueTime(){
    return this.slotenqueueTime;
  }
  @IDataAnnotation(OriginalFieldName="enqueueTime",FieldName="slotenqueueTime",SlotKey="/enqueueTime;3.9;0",Position=2,CameFromFloat=false) public void setSlotenqueueTime(  Date paramenqueueTime){
    this.slotenqueueTime=paramenqueueTime;
  }
}
