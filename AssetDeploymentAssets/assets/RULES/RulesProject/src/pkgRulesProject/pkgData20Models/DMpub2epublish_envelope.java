package pkgRulesProject.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
import java.util.Date;
@IRuleAnnotation(RuleProjectName="RulesProject",DataModelName="pub.publish_envelope",EventTypeName="") public class DMpub2epublish_envelope extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotactivation;
  private Integer slotappLastSeqn;
  private String slotappPassword;
  private Integer slotappSeqn;
  private String slotappUserName;
  private Integer slotpriority;
  private String slotbusinessContext;
  private Short[] slotcontrolLabel;
  private String sloterrorsTo;
  private String sloterrorRequestsTo;
  private String slotlocale;
  private Integer slotmaxResults;
  private String slotreplyTo;
  private Integer slotrunLevel;
  private byte[] slotsignature;
  private String slotsignatureType;
  private Integer slotstartResult;
  private Integer slottag;
  private String slottrackId;
  private String slottransactionId;
  private String slottransformState;
  private Integer slotage;
  private String slotconnectionIntegrity;
  private String slotdestId;
  private Date slotenqueueTime;
  private String slotlogBroker;
  private String slotlogHost;
  private String slotpubDistinguishedName;
  private String slotpubId;
  private byte[] slotpubNetAddr;
  private Long slotpubSeqn;
  private Short[] slotpubLabel;
  private Date slotrecvTime;
  private DMpub2epublish3aenvelope_route[] slotroute;
  private String slotuuid;
  @IDataAnnotation(OriginalFieldName="activation",FieldName="slotactivation",SlotKey="/activation;1;0",Position=0,CameFromFloat=false) public String getSlotactivation(){
    return this.slotactivation;
  }
  @IDataAnnotation(OriginalFieldName="activation",FieldName="slotactivation",SlotKey="/activation;1;0",Position=0,CameFromFloat=false) public void setSlotactivation(  String paramactivation){
    this.slotactivation=paramactivation;
  }
  @IDataAnnotation(OriginalFieldName="appLastSeqn",FieldName="slotappLastSeqn",SlotKey="/appLastSeqn;3.6;0",Position=1,CameFromFloat=false) public Integer getSlotappLastSeqn(){
    return this.slotappLastSeqn;
  }
  @IDataAnnotation(OriginalFieldName="appLastSeqn",FieldName="slotappLastSeqn",SlotKey="/appLastSeqn;3.6;0",Position=1,CameFromFloat=false) public void setSlotappLastSeqn(  Integer paramappLastSeqn){
    this.slotappLastSeqn=paramappLastSeqn;
  }
  @IDataAnnotation(OriginalFieldName="appLastSeqn",FieldName="slotappLastSeqn",SlotKey="/appLastSeqn;3.6;0",Position=1,CameFromFloat=false) public void setSlotappLastSeqn(  String paramappLastSeqn){
    if (paramappLastSeqn != null) {
      this.slotappLastSeqn=new Integer(paramappLastSeqn);
    }
 else {
      this.slotappLastSeqn=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="appLastSeqn",FieldName="slotappLastSeqn",SlotKey="/appLastSeqn;3.6;0",Position=1,CameFromFloat=false) public void setSlotappLastSeqn(  Double paramappLastSeqn){
    if (paramappLastSeqn != null) {
      this.slotappLastSeqn=paramappLastSeqn.intValue();
    }
 else {
      this.slotappLastSeqn=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="appPassword",FieldName="slotappPassword",SlotKey="/appPassword;1;0",Position=2,CameFromFloat=false) public String getSlotappPassword(){
    return this.slotappPassword;
  }
  @IDataAnnotation(OriginalFieldName="appPassword",FieldName="slotappPassword",SlotKey="/appPassword;1;0",Position=2,CameFromFloat=false) public void setSlotappPassword(  String paramappPassword){
    this.slotappPassword=paramappPassword;
  }
  @IDataAnnotation(OriginalFieldName="appSeqn",FieldName="slotappSeqn",SlotKey="/appSeqn;3.6;0",Position=3,CameFromFloat=false) public Integer getSlotappSeqn(){
    return this.slotappSeqn;
  }
  @IDataAnnotation(OriginalFieldName="appSeqn",FieldName="slotappSeqn",SlotKey="/appSeqn;3.6;0",Position=3,CameFromFloat=false) public void setSlotappSeqn(  Integer paramappSeqn){
    this.slotappSeqn=paramappSeqn;
  }
  @IDataAnnotation(OriginalFieldName="appSeqn",FieldName="slotappSeqn",SlotKey="/appSeqn;3.6;0",Position=3,CameFromFloat=false) public void setSlotappSeqn(  String paramappSeqn){
    if (paramappSeqn != null) {
      this.slotappSeqn=new Integer(paramappSeqn);
    }
 else {
      this.slotappSeqn=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="appSeqn",FieldName="slotappSeqn",SlotKey="/appSeqn;3.6;0",Position=3,CameFromFloat=false) public void setSlotappSeqn(  Double paramappSeqn){
    if (paramappSeqn != null) {
      this.slotappSeqn=paramappSeqn.intValue();
    }
 else {
      this.slotappSeqn=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="appUserName",FieldName="slotappUserName",SlotKey="/appUserName;1;0",Position=4,CameFromFloat=false) public String getSlotappUserName(){
    return this.slotappUserName;
  }
  @IDataAnnotation(OriginalFieldName="appUserName",FieldName="slotappUserName",SlotKey="/appUserName;1;0",Position=4,CameFromFloat=false) public void setSlotappUserName(  String paramappUserName){
    this.slotappUserName=paramappUserName;
  }
  @IDataAnnotation(OriginalFieldName="priority",FieldName="slotpriority",SlotKey="/priority;3.6;0",Position=5,CameFromFloat=false) public Integer getSlotpriority(){
    return this.slotpriority;
  }
  @IDataAnnotation(OriginalFieldName="priority",FieldName="slotpriority",SlotKey="/priority;3.6;0",Position=5,CameFromFloat=false) public void setSlotpriority(  Integer parampriority){
    this.slotpriority=parampriority;
  }
  @IDataAnnotation(OriginalFieldName="priority",FieldName="slotpriority",SlotKey="/priority;3.6;0",Position=5,CameFromFloat=false) public void setSlotpriority(  String parampriority){
    if (parampriority != null) {
      this.slotpriority=new Integer(parampriority);
    }
 else {
      this.slotpriority=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="priority",FieldName="slotpriority",SlotKey="/priority;3.6;0",Position=5,CameFromFloat=false) public void setSlotpriority(  Double parampriority){
    if (parampriority != null) {
      this.slotpriority=parampriority.intValue();
    }
 else {
      this.slotpriority=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="businessContext",FieldName="slotbusinessContext",SlotKey="/businessContext;1;0",Position=6,CameFromFloat=false) public String getSlotbusinessContext(){
    return this.slotbusinessContext;
  }
  @IDataAnnotation(OriginalFieldName="businessContext",FieldName="slotbusinessContext",SlotKey="/businessContext;1;0",Position=6,CameFromFloat=false) public void setSlotbusinessContext(  String parambusinessContext){
    this.slotbusinessContext=parambusinessContext;
  }
  @IDataAnnotation(OriginalFieldName="controlLabel",FieldName="slotcontrolLabel",SlotKey="/controlLabel;3.8;1",Position=7,CameFromFloat=false) public Short[] getSlotcontrolLabel(){
    return this.slotcontrolLabel;
  }
  @IDataAnnotation(OriginalFieldName="controlLabel",FieldName="slotcontrolLabel",SlotKey="/controlLabel;3.8;1",Position=7,CameFromFloat=false) public void setSlotcontrolLabel(  Short[] paramcontrolLabel){
    this.slotcontrolLabel=paramcontrolLabel;
  }
  @IDataAnnotation(OriginalFieldName="controlLabel",FieldName="slotcontrolLabel",SlotKey="/controlLabel;3.8;1",Position=7,CameFromFloat=false) public void setSlotcontrolLabel(  Short paramcontrolLabel,  int idx1){
    this.slotcontrolLabel[idx1]=paramcontrolLabel;
  }
  @IDataAnnotation(OriginalFieldName="controlLabel",FieldName="slotcontrolLabel",SlotKey="/controlLabel;3.8;1",Position=7,CameFromFloat=false) public void setSlotcontrolLabel(  String paramcontrolLabel,  int idx1){
    this.slotcontrolLabel[idx1]=new Short(paramcontrolLabel);
  }
  @IDataAnnotation(OriginalFieldName="controlLabel",FieldName="slotcontrolLabel",SlotKey="/controlLabel;3.8;1",Position=7,CameFromFloat=false) public void setSlotcontrolLabel(  Double paramcontrolLabel,  int idx1){
    this.slotcontrolLabel[idx1]=paramcontrolLabel.shortValue();
  }
  @IDataAnnotation(OriginalFieldName="controlLabel",FieldName="slotcontrolLabel",SlotKey="/controlLabel;3.8;1",Position=7,CameFromFloat=false) public void insertSlotcontrolLabel(  Short paramcontrolLabel,  int idx1){
    if (this.slotcontrolLabel != null) {
      int len=this.slotcontrolLabel.length + 1;
      int copyLen=1;
      if (idx1 > this.slotcontrolLabel.length) {
        len=idx1 + 1;
      }
 else {
        copyLen=this.slotcontrolLabel.length - idx1;
      }
      Short[] templist=new Short[len];
      System.arraycopy(this.slotcontrolLabel,0,templist,0,this.slotcontrolLabel.length);
      if (idx1 < this.slotcontrolLabel.length) {
        System.arraycopy(this.slotcontrolLabel,idx1,templist,idx1 + 1,copyLen);
      }
      this.slotcontrolLabel=templist;
    }
 else {
      this.slotcontrolLabel=new Short[idx1 + 1];
    }
    this.slotcontrolLabel[idx1]=paramcontrolLabel;
  }
  public void appendSlotcontrolLabel(  Short paramcontrolLabel){
    Short[] templist=null;
    if (this.slotcontrolLabel == null) {
      templist=new Short[]{paramcontrolLabel};
    }
 else {
      templist=new Short[this.slotcontrolLabel.length + 1];
      System.arraycopy(this.slotcontrolLabel,0,templist,0,this.slotcontrolLabel.length);
      templist[templist.length - 1]=paramcontrolLabel;
    }
    this.slotcontrolLabel=templist;
  }
  @SuppressWarnings("unused") public void removeSlotcontrolLabel(  int idx1){
    int length=this.slotcontrolLabel.length;
    Short test=this.slotcontrolLabel[idx1];
    Short[] templist=new Short[length - 1];
    System.arraycopy(this.slotcontrolLabel,0,templist,0,idx1);
    if (idx1 < length - 1) {
      System.arraycopy(this.slotcontrolLabel,idx1 + 1,templist,idx1,length - idx1 - 1);
    }
    this.slotcontrolLabel=templist;
  }
  public void initSlotcontrolLabel(  int sz1){
    this.slotcontrolLabel=new Short[sz1];
  }
  @IDataAnnotation(OriginalFieldName="errorsTo",FieldName="sloterrorsTo",SlotKey="/errorsTo;1;0",Position=8,CameFromFloat=false) public String getSloterrorsTo(){
    return this.sloterrorsTo;
  }
  @IDataAnnotation(OriginalFieldName="errorsTo",FieldName="sloterrorsTo",SlotKey="/errorsTo;1;0",Position=8,CameFromFloat=false) public void setSloterrorsTo(  String paramerrorsTo){
    this.sloterrorsTo=paramerrorsTo;
  }
  @IDataAnnotation(OriginalFieldName="errorRequestsTo",FieldName="sloterrorRequestsTo",SlotKey="/errorRequestsTo;1;0",Position=9,CameFromFloat=false) public String getSloterrorRequestsTo(){
    return this.sloterrorRequestsTo;
  }
  @IDataAnnotation(OriginalFieldName="errorRequestsTo",FieldName="sloterrorRequestsTo",SlotKey="/errorRequestsTo;1;0",Position=9,CameFromFloat=false) public void setSloterrorRequestsTo(  String paramerrorRequestsTo){
    this.sloterrorRequestsTo=paramerrorRequestsTo;
  }
  @IDataAnnotation(OriginalFieldName="locale",FieldName="slotlocale",SlotKey="/locale;1;0",Position=10,CameFromFloat=false) public String getSlotlocale(){
    return this.slotlocale;
  }
  @IDataAnnotation(OriginalFieldName="locale",FieldName="slotlocale",SlotKey="/locale;1;0",Position=10,CameFromFloat=false) public void setSlotlocale(  String paramlocale){
    this.slotlocale=paramlocale;
  }
  @IDataAnnotation(OriginalFieldName="maxResults",FieldName="slotmaxResults",SlotKey="/maxResults;3.6;0",Position=11,CameFromFloat=false) public Integer getSlotmaxResults(){
    return this.slotmaxResults;
  }
  @IDataAnnotation(OriginalFieldName="maxResults",FieldName="slotmaxResults",SlotKey="/maxResults;3.6;0",Position=11,CameFromFloat=false) public void setSlotmaxResults(  Integer parammaxResults){
    this.slotmaxResults=parammaxResults;
  }
  @IDataAnnotation(OriginalFieldName="maxResults",FieldName="slotmaxResults",SlotKey="/maxResults;3.6;0",Position=11,CameFromFloat=false) public void setSlotmaxResults(  String parammaxResults){
    if (parammaxResults != null) {
      this.slotmaxResults=new Integer(parammaxResults);
    }
 else {
      this.slotmaxResults=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="maxResults",FieldName="slotmaxResults",SlotKey="/maxResults;3.6;0",Position=11,CameFromFloat=false) public void setSlotmaxResults(  Double parammaxResults){
    if (parammaxResults != null) {
      this.slotmaxResults=parammaxResults.intValue();
    }
 else {
      this.slotmaxResults=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="replyTo",FieldName="slotreplyTo",SlotKey="/replyTo;1;0",Position=12,CameFromFloat=false) public String getSlotreplyTo(){
    return this.slotreplyTo;
  }
  @IDataAnnotation(OriginalFieldName="replyTo",FieldName="slotreplyTo",SlotKey="/replyTo;1;0",Position=12,CameFromFloat=false) public void setSlotreplyTo(  String paramreplyTo){
    this.slotreplyTo=paramreplyTo;
  }
  @IDataAnnotation(OriginalFieldName="runLevel",FieldName="slotrunLevel",SlotKey="/runLevel;3.6;0",Position=13,CameFromFloat=false) public Integer getSlotrunLevel(){
    return this.slotrunLevel;
  }
  @IDataAnnotation(OriginalFieldName="runLevel",FieldName="slotrunLevel",SlotKey="/runLevel;3.6;0",Position=13,CameFromFloat=false) public void setSlotrunLevel(  Integer paramrunLevel){
    this.slotrunLevel=paramrunLevel;
  }
  @IDataAnnotation(OriginalFieldName="runLevel",FieldName="slotrunLevel",SlotKey="/runLevel;3.6;0",Position=13,CameFromFloat=false) public void setSlotrunLevel(  String paramrunLevel){
    if (paramrunLevel != null) {
      this.slotrunLevel=new Integer(paramrunLevel);
    }
 else {
      this.slotrunLevel=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="runLevel",FieldName="slotrunLevel",SlotKey="/runLevel;3.6;0",Position=13,CameFromFloat=false) public void setSlotrunLevel(  Double paramrunLevel){
    if (paramrunLevel != null) {
      this.slotrunLevel=paramrunLevel.intValue();
    }
 else {
      this.slotrunLevel=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="signature",FieldName="slotsignature",SlotKey="/signature;3.10;0",Position=14,CameFromFloat=false) public byte[] getSlotsignature(){
    return this.slotsignature;
  }
  @IDataAnnotation(OriginalFieldName="signature",FieldName="slotsignature",SlotKey="/signature;3.10;0",Position=14,CameFromFloat=false) public void setSlotsignature(  byte[] paramsignature){
    this.slotsignature=paramsignature;
  }
  @IDataAnnotation(OriginalFieldName="signatureType",FieldName="slotsignatureType",SlotKey="/signatureType;1;0",Position=15,CameFromFloat=false) public String getSlotsignatureType(){
    return this.slotsignatureType;
  }
  @IDataAnnotation(OriginalFieldName="signatureType",FieldName="slotsignatureType",SlotKey="/signatureType;1;0",Position=15,CameFromFloat=false) public void setSlotsignatureType(  String paramsignatureType){
    this.slotsignatureType=paramsignatureType;
  }
  @IDataAnnotation(OriginalFieldName="startResult",FieldName="slotstartResult",SlotKey="/startResult;3.6;0",Position=16,CameFromFloat=false) public Integer getSlotstartResult(){
    return this.slotstartResult;
  }
  @IDataAnnotation(OriginalFieldName="startResult",FieldName="slotstartResult",SlotKey="/startResult;3.6;0",Position=16,CameFromFloat=false) public void setSlotstartResult(  Integer paramstartResult){
    this.slotstartResult=paramstartResult;
  }
  @IDataAnnotation(OriginalFieldName="startResult",FieldName="slotstartResult",SlotKey="/startResult;3.6;0",Position=16,CameFromFloat=false) public void setSlotstartResult(  String paramstartResult){
    if (paramstartResult != null) {
      this.slotstartResult=new Integer(paramstartResult);
    }
 else {
      this.slotstartResult=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="startResult",FieldName="slotstartResult",SlotKey="/startResult;3.6;0",Position=16,CameFromFloat=false) public void setSlotstartResult(  Double paramstartResult){
    if (paramstartResult != null) {
      this.slotstartResult=paramstartResult.intValue();
    }
 else {
      this.slotstartResult=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="tag",FieldName="slottag",SlotKey="/tag;3.6;0",Position=17,CameFromFloat=false) public Integer getSlottag(){
    return this.slottag;
  }
  @IDataAnnotation(OriginalFieldName="tag",FieldName="slottag",SlotKey="/tag;3.6;0",Position=17,CameFromFloat=false) public void setSlottag(  Integer paramtag){
    this.slottag=paramtag;
  }
  @IDataAnnotation(OriginalFieldName="tag",FieldName="slottag",SlotKey="/tag;3.6;0",Position=17,CameFromFloat=false) public void setSlottag(  String paramtag){
    if (paramtag != null) {
      this.slottag=new Integer(paramtag);
    }
 else {
      this.slottag=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="tag",FieldName="slottag",SlotKey="/tag;3.6;0",Position=17,CameFromFloat=false) public void setSlottag(  Double paramtag){
    if (paramtag != null) {
      this.slottag=paramtag.intValue();
    }
 else {
      this.slottag=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="trackId",FieldName="slottrackId",SlotKey="/trackId;1;0",Position=18,CameFromFloat=false) public String getSlottrackId(){
    return this.slottrackId;
  }
  @IDataAnnotation(OriginalFieldName="trackId",FieldName="slottrackId",SlotKey="/trackId;1;0",Position=18,CameFromFloat=false) public void setSlottrackId(  String paramtrackId){
    this.slottrackId=paramtrackId;
  }
  @IDataAnnotation(OriginalFieldName="transactionId",FieldName="slottransactionId",SlotKey="/transactionId;1;0",Position=19,CameFromFloat=false) public String getSlottransactionId(){
    return this.slottransactionId;
  }
  @IDataAnnotation(OriginalFieldName="transactionId",FieldName="slottransactionId",SlotKey="/transactionId;1;0",Position=19,CameFromFloat=false) public void setSlottransactionId(  String paramtransactionId){
    this.slottransactionId=paramtransactionId;
  }
  @IDataAnnotation(OriginalFieldName="transformState",FieldName="slottransformState",SlotKey="/transformState;1;0",Position=20,CameFromFloat=false) public String getSlottransformState(){
    return this.slottransformState;
  }
  @IDataAnnotation(OriginalFieldName="transformState",FieldName="slottransformState",SlotKey="/transformState;1;0",Position=20,CameFromFloat=false) public void setSlottransformState(  String paramtransformState){
    this.slottransformState=paramtransformState;
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=21,CameFromFloat=false) public Integer getSlotage(){
    return this.slotage;
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=21,CameFromFloat=false) public void setSlotage(  Integer paramage){
    this.slotage=paramage;
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=21,CameFromFloat=false) public void setSlotage(  String paramage){
    if (paramage != null) {
      this.slotage=new Integer(paramage);
    }
 else {
      this.slotage=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=21,CameFromFloat=false) public void setSlotage(  Double paramage){
    if (paramage != null) {
      this.slotage=paramage.intValue();
    }
 else {
      this.slotage=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="connectionIntegrity",FieldName="slotconnectionIntegrity",SlotKey="/connectionIntegrity;1;0",Position=22,CameFromFloat=false) public String getSlotconnectionIntegrity(){
    return this.slotconnectionIntegrity;
  }
  @IDataAnnotation(OriginalFieldName="connectionIntegrity",FieldName="slotconnectionIntegrity",SlotKey="/connectionIntegrity;1;0",Position=22,CameFromFloat=false) public void setSlotconnectionIntegrity(  String paramconnectionIntegrity){
    this.slotconnectionIntegrity=paramconnectionIntegrity;
  }
  @IDataAnnotation(OriginalFieldName="destId",FieldName="slotdestId",SlotKey="/destId;1;0",Position=23,CameFromFloat=false) public String getSlotdestId(){
    return this.slotdestId;
  }
  @IDataAnnotation(OriginalFieldName="destId",FieldName="slotdestId",SlotKey="/destId;1;0",Position=23,CameFromFloat=false) public void setSlotdestId(  String paramdestId){
    this.slotdestId=paramdestId;
  }
  @IDataAnnotation(OriginalFieldName="enqueueTime",FieldName="slotenqueueTime",SlotKey="/enqueueTime;3.9;0",Position=24,CameFromFloat=false) public Date getSlotenqueueTime(){
    return this.slotenqueueTime;
  }
  @IDataAnnotation(OriginalFieldName="enqueueTime",FieldName="slotenqueueTime",SlotKey="/enqueueTime;3.9;0",Position=24,CameFromFloat=false) public void setSlotenqueueTime(  Date paramenqueueTime){
    this.slotenqueueTime=paramenqueueTime;
  }
  @IDataAnnotation(OriginalFieldName="logBroker",FieldName="slotlogBroker",SlotKey="/logBroker;1;0",Position=25,CameFromFloat=false) public String getSlotlogBroker(){
    return this.slotlogBroker;
  }
  @IDataAnnotation(OriginalFieldName="logBroker",FieldName="slotlogBroker",SlotKey="/logBroker;1;0",Position=25,CameFromFloat=false) public void setSlotlogBroker(  String paramlogBroker){
    this.slotlogBroker=paramlogBroker;
  }
  @IDataAnnotation(OriginalFieldName="logHost",FieldName="slotlogHost",SlotKey="/logHost;1;0",Position=26,CameFromFloat=false) public String getSlotlogHost(){
    return this.slotlogHost;
  }
  @IDataAnnotation(OriginalFieldName="logHost",FieldName="slotlogHost",SlotKey="/logHost;1;0",Position=26,CameFromFloat=false) public void setSlotlogHost(  String paramlogHost){
    this.slotlogHost=paramlogHost;
  }
  @IDataAnnotation(OriginalFieldName="pubDistinguishedName",FieldName="slotpubDistinguishedName",SlotKey="/pubDistinguishedName;1;0",Position=27,CameFromFloat=false) public String getSlotpubDistinguishedName(){
    return this.slotpubDistinguishedName;
  }
  @IDataAnnotation(OriginalFieldName="pubDistinguishedName",FieldName="slotpubDistinguishedName",SlotKey="/pubDistinguishedName;1;0",Position=27,CameFromFloat=false) public void setSlotpubDistinguishedName(  String parampubDistinguishedName){
    this.slotpubDistinguishedName=parampubDistinguishedName;
  }
  @IDataAnnotation(OriginalFieldName="pubId",FieldName="slotpubId",SlotKey="/pubId;1;0",Position=28,CameFromFloat=false) public String getSlotpubId(){
    return this.slotpubId;
  }
  @IDataAnnotation(OriginalFieldName="pubId",FieldName="slotpubId",SlotKey="/pubId;1;0",Position=28,CameFromFloat=false) public void setSlotpubId(  String parampubId){
    this.slotpubId=parampubId;
  }
  @IDataAnnotation(OriginalFieldName="pubNetAddr",FieldName="slotpubNetAddr",SlotKey="/pubNetAddr;3.10;0",Position=29,CameFromFloat=false) public byte[] getSlotpubNetAddr(){
    return this.slotpubNetAddr;
  }
  @IDataAnnotation(OriginalFieldName="pubNetAddr",FieldName="slotpubNetAddr",SlotKey="/pubNetAddr;3.10;0",Position=29,CameFromFloat=false) public void setSlotpubNetAddr(  byte[] parampubNetAddr){
    this.slotpubNetAddr=parampubNetAddr;
  }
  @IDataAnnotation(OriginalFieldName="pubSeqn",FieldName="slotpubSeqn",SlotKey="/pubSeqn;3.7;0",Position=30,CameFromFloat=false) public Long getSlotpubSeqn(){
    return this.slotpubSeqn;
  }
  @IDataAnnotation(OriginalFieldName="pubSeqn",FieldName="slotpubSeqn",SlotKey="/pubSeqn;3.7;0",Position=30,CameFromFloat=false) public void setSlotpubSeqn(  Long parampubSeqn){
    this.slotpubSeqn=parampubSeqn;
  }
  @IDataAnnotation(OriginalFieldName="pubSeqn",FieldName="slotpubSeqn",SlotKey="/pubSeqn;3.7;0",Position=30,CameFromFloat=false) public void setSlotpubSeqn(  String parampubSeqn){
    if (parampubSeqn != null) {
      this.slotpubSeqn=new Long(parampubSeqn);
    }
 else {
      this.slotpubSeqn=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="pubSeqn",FieldName="slotpubSeqn",SlotKey="/pubSeqn;3.7;0",Position=30,CameFromFloat=false) public void setSlotpubSeqn(  Double parampubSeqn){
    if (parampubSeqn != null) {
      this.slotpubSeqn=parampubSeqn.longValue();
    }
 else {
      this.slotpubSeqn=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="pubLabel",FieldName="slotpubLabel",SlotKey="/pubLabel;3.8;1",Position=31,CameFromFloat=false) public Short[] getSlotpubLabel(){
    return this.slotpubLabel;
  }
  @IDataAnnotation(OriginalFieldName="pubLabel",FieldName="slotpubLabel",SlotKey="/pubLabel;3.8;1",Position=31,CameFromFloat=false) public void setSlotpubLabel(  Short[] parampubLabel){
    this.slotpubLabel=parampubLabel;
  }
  @IDataAnnotation(OriginalFieldName="pubLabel",FieldName="slotpubLabel",SlotKey="/pubLabel;3.8;1",Position=31,CameFromFloat=false) public void setSlotpubLabel(  Short parampubLabel,  int idx1){
    this.slotpubLabel[idx1]=parampubLabel;
  }
  @IDataAnnotation(OriginalFieldName="pubLabel",FieldName="slotpubLabel",SlotKey="/pubLabel;3.8;1",Position=31,CameFromFloat=false) public void setSlotpubLabel(  String parampubLabel,  int idx1){
    this.slotpubLabel[idx1]=new Short(parampubLabel);
  }
  @IDataAnnotation(OriginalFieldName="pubLabel",FieldName="slotpubLabel",SlotKey="/pubLabel;3.8;1",Position=31,CameFromFloat=false) public void setSlotpubLabel(  Double parampubLabel,  int idx1){
    this.slotpubLabel[idx1]=parampubLabel.shortValue();
  }
  @IDataAnnotation(OriginalFieldName="pubLabel",FieldName="slotpubLabel",SlotKey="/pubLabel;3.8;1",Position=31,CameFromFloat=false) public void insertSlotpubLabel(  Short parampubLabel,  int idx1){
    if (this.slotpubLabel != null) {
      int len=this.slotpubLabel.length + 1;
      int copyLen=1;
      if (idx1 > this.slotpubLabel.length) {
        len=idx1 + 1;
      }
 else {
        copyLen=this.slotpubLabel.length - idx1;
      }
      Short[] templist=new Short[len];
      System.arraycopy(this.slotpubLabel,0,templist,0,this.slotpubLabel.length);
      if (idx1 < this.slotpubLabel.length) {
        System.arraycopy(this.slotpubLabel,idx1,templist,idx1 + 1,copyLen);
      }
      this.slotpubLabel=templist;
    }
 else {
      this.slotpubLabel=new Short[idx1 + 1];
    }
    this.slotpubLabel[idx1]=parampubLabel;
  }
  public void appendSlotpubLabel(  Short parampubLabel){
    Short[] templist=null;
    if (this.slotpubLabel == null) {
      templist=new Short[]{parampubLabel};
    }
 else {
      templist=new Short[this.slotpubLabel.length + 1];
      System.arraycopy(this.slotpubLabel,0,templist,0,this.slotpubLabel.length);
      templist[templist.length - 1]=parampubLabel;
    }
    this.slotpubLabel=templist;
  }
  @SuppressWarnings("unused") public void removeSlotpubLabel(  int idx1){
    int length=this.slotpubLabel.length;
    Short test=this.slotpubLabel[idx1];
    Short[] templist=new Short[length - 1];
    System.arraycopy(this.slotpubLabel,0,templist,0,idx1);
    if (idx1 < length - 1) {
      System.arraycopy(this.slotpubLabel,idx1 + 1,templist,idx1,length - idx1 - 1);
    }
    this.slotpubLabel=templist;
  }
  public void initSlotpubLabel(  int sz1){
    this.slotpubLabel=new Short[sz1];
  }
  @IDataAnnotation(OriginalFieldName="recvTime",FieldName="slotrecvTime",SlotKey="/recvTime;3.9;0",Position=32,CameFromFloat=false) public Date getSlotrecvTime(){
    return this.slotrecvTime;
  }
  @IDataAnnotation(OriginalFieldName="recvTime",FieldName="slotrecvTime",SlotKey="/recvTime;3.9;0",Position=32,CameFromFloat=false) public void setSlotrecvTime(  Date paramrecvTime){
    this.slotrecvTime=paramrecvTime;
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public DMpub2epublish3aenvelope_route[] getSlotroute(){
    return this.slotroute;
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public void setSlotroute(  DMpub2epublish3aenvelope_route[] paramroute){
    this.slotroute=paramroute;
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public void setSlotroute(  DMpub2epublish3aenvelope_route paramroute,  int idx1){
    this.slotroute[idx1]=paramroute;
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public void setSlotroute(  Object paramroute,  int idx1){
    this.slotroute[idx1]=(DMpub2epublish3aenvelope_route)paramroute;
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public void insertSlotroute(  Object paramroute,  int idx1){
    insertSlotroute((DMpub2epublish3aenvelope_route)paramroute,idx1);
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public void appendSlotroute(  Object paramroute,  int idx1){
    appendSlotroute((DMpub2epublish3aenvelope_route)paramroute);
  }
  @IDataAnnotation(OriginalFieldName="route",FieldName="slotroute",SlotKey="/route;2;1",Position=33,CameFromFloat=false) public void insertSlotroute(  DMpub2epublish3aenvelope_route paramroute,  int idx1){
    if (this.slotroute != null) {
      int len=this.slotroute.length + 1;
      int copyLen=1;
      if (idx1 > this.slotroute.length) {
        len=idx1 + 1;
      }
 else {
        copyLen=this.slotroute.length - idx1;
      }
      DMpub2epublish3aenvelope_route[] templist=new DMpub2epublish3aenvelope_route[len];
      System.arraycopy(this.slotroute,0,templist,0,this.slotroute.length);
      if (idx1 < this.slotroute.length) {
        System.arraycopy(this.slotroute,idx1,templist,idx1 + 1,copyLen);
      }
      this.slotroute=templist;
    }
 else {
      this.slotroute=new DMpub2epublish3aenvelope_route[idx1 + 1];
    }
    this.slotroute[idx1]=paramroute;
  }
  public void appendSlotroute(  DMpub2epublish3aenvelope_route paramroute){
    DMpub2epublish3aenvelope_route[] templist=null;
    if (this.slotroute == null) {
      templist=new DMpub2epublish3aenvelope_route[]{paramroute};
    }
 else {
      templist=new DMpub2epublish3aenvelope_route[this.slotroute.length + 1];
      System.arraycopy(this.slotroute,0,templist,0,this.slotroute.length);
      templist[templist.length - 1]=paramroute;
    }
    this.slotroute=templist;
  }
  @SuppressWarnings("unused") public void removeSlotroute(  int idx1){
    int length=this.slotroute.length;
    DMpub2epublish3aenvelope_route test=this.slotroute[idx1];
    DMpub2epublish3aenvelope_route[] templist=new DMpub2epublish3aenvelope_route[length - 1];
    System.arraycopy(this.slotroute,0,templist,0,idx1);
    if (idx1 < length - 1) {
      System.arraycopy(this.slotroute,idx1 + 1,templist,idx1,length - idx1 - 1);
    }
    this.slotroute=templist;
  }
  public void initSlotroute(  int sz1){
    this.slotroute=new DMpub2epublish3aenvelope_route[sz1];
  }
  @IDataAnnotation(OriginalFieldName="uuid",FieldName="slotuuid",SlotKey="/uuid;1;0",Position=34,CameFromFloat=false) public String getSlotuuid(){
    return this.slotuuid;
  }
  @IDataAnnotation(OriginalFieldName="uuid",FieldName="slotuuid",SlotKey="/uuid;1;0",Position=34,CameFromFloat=false) public void setSlotuuid(  String paramuuid){
    this.slotuuid=paramuuid;
  }
}
