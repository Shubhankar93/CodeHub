
package objectCloning;

//import org.omg.Messaging.SyncScopeHelper;

public class OC_Clonable implements Cloneable  {
	public int k; 
	public int l;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	} 

}


//******************************   End   *******************************