package DCMS;

/**
* DCMS/CenterServerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CenterServer.idl
* Saturday, July 8, 2017 3:04:58 PM EDT
*/

public final class CenterServerHolder implements org.omg.CORBA.portable.Streamable
{
  public DCMS.CenterServer value = null;

  public CenterServerHolder ()
  {
  }

  public CenterServerHolder (DCMS.CenterServer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DCMS.CenterServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DCMS.CenterServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DCMS.CenterServerHelper.type ();
  }

}
