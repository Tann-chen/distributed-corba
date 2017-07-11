package DCMS;


/**
* DCMS/CenterServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CenterServer.idl
* Tuesday, July 11, 2017 4:40:14 PM EDT
*/

public interface CenterServerOperations 
{
  boolean createTRecord (String managerId, String firstName, String lastName, String address, String phone, String specialization, String location);
  boolean createSRecord (String managerId, String firstName, String lastName, String coursesRegistered, String status, String date);
  String getRecordCounts (String managerId);
  boolean editRecord (String managerId, String recordID, String fieldName, String newValue);
  boolean transferRecord (String managerId, String recordID, String remoteCenterServerName);
  void shutdown ();
  String getRecordInfo (String recordID);
} // interface CenterServerOperations
