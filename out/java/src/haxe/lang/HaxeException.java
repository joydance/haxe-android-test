// Generated by Haxe 4.0.5
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HaxeException extends java.lang.RuntimeException
{
	public static final long serialVersionUID = 5956463319488556322L;public HaxeException(java.lang.Object obj, java.lang.String msg, java.lang.Throwable cause)
	{
		//line 47 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		super(msg, cause);
		//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( obj instanceof haxe.lang.HaxeException )) 
		{
			//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			haxe.lang.HaxeException _obj = ((haxe.lang.HaxeException) (obj) );
			//line 51 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			obj = _obj.getObject();
		}
		
		//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		this.obj = obj;
	}
	
	
	public static java.lang.RuntimeException wrap(java.lang.Object obj)
	{
		//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		java.lang.RuntimeException ret = null;
		//line 80 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( obj instanceof java.lang.RuntimeException )) 
		{
			//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			ret = ((java.lang.RuntimeException) (obj) );
		}
		else
		{
			//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			if (( obj instanceof java.lang.String )) 
			{
				//line 83 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
				ret = new haxe.lang.HaxeException(obj, haxe.lang.Runtime.toString(obj), null);
			}
			else
			{
				//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
				if (( obj instanceof java.lang.Throwable )) 
				{
					//line 85 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
					ret = new haxe.lang.HaxeException(obj, haxe.root.Std.string(obj), ((java.lang.Throwable) (obj) ));
				}
				else
				{
					//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
					ret = new haxe.lang.HaxeException(obj, haxe.root.Std.string(obj), null);
				}
				
			}
			
		}
		
		//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return ret;
	}
	
	
	public java.lang.Object obj;
	
	public java.lang.Object getObject()
	{
		//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return this.obj;
	}
	
	
	@Override public java.lang.Throwable fillInStackTrace()
	{
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return this;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 68 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return ( "Haxe Exception: " + haxe.root.Std.string(this.obj) );
	}
	
	
	@Override public java.lang.String getMessage()
	{
		//line 72 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		java.lang.String _g = super.getMessage();
		//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( _g == null )) 
		{
			//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			return haxe.root.Std.string(this.obj);
		}
		else
		{
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			java.lang.String message = _g;
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			return message;
		}
		
	}
	
	
}


