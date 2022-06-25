package objectCloning;

import org.omg.Messaging.SyncScopeHelper;

public class OC_Test  implements Cloneable {
	int k; 
	int l;
	
	 protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	} 

}
