/**
 * 
 */
package abstractGame;

import javax.swing.JOptionPane;

/**
 * @author Erik
 *
 */
public class TryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameObject d[] = new Tuer[3];
		GameObject k[] = new Key[3];
		for(int i = 0; i < d.length; i++){
			d[i] = new Tuer();
			k[i] = new Key();
			((Tuer)d[i]).id = i;
			((Key)k[i]).id = i;
			((Key)k[i]).isBroken = false;
		}
		boolean b = true;
		while(b){
			try{
				int i = Integer.parseInt(JOptionPane.showInputDialog("du stehst an der ersten der 3 T�ren,\ndu hast 3 Schl�ssel welchen probierst du?"));
				if(k[i-1].useOn(d[0])){
					JOptionPane.showMessageDialog(null, "T�re ge�fnet");
				}else{
					JOptionPane.showMessageDialog(null, "Schl�ssel abgebrochen");
				}
				i = Integer.parseInt(JOptionPane.showInputDialog("du stehst an der zweiten der 3 T�ren,\ndu hast 3 Schl�ssel welchen probierst du?"));
				if(k[i-1].useOn(d[1])){
					JOptionPane.showMessageDialog(null, "T�re ge�fnet");
				}else{
					JOptionPane.showMessageDialog(null, "Schl�ssel abgebrochen");
				}
				i = Integer.parseInt(JOptionPane.showInputDialog("du stehst an der dritten der 3 T�ren,\ndu hast 3 Schl�ssel welchen probierst du?"));
				if(k[i-1].useOn(d[2])){
					JOptionPane.showMessageDialog(null, "T�re ge�fnet");
				}else{
					JOptionPane.showMessageDialog(null, "Schl�ssel abgebrochen");
				}
				b=false;
			}catch(ArrayIndexOutOfBoundsException e){
				
			}
		}
	}

}
