/* Nama 	: Marpaung, Deborah T
 * Kelas	: D3 - 2A Teknik Informatika
 * NIM		: 201511014
 */

package javacollection;

public class Barang {
	private Status status;
	private ServicePackage servicePackage;
	private City city;
	private int weight;
	private int quantity;
	private int priceItem;
	private String productName;
	
	public String toString() {
		return "Barang{" + productName + " | " + quantity +  " | " + weight
				+ " | " + city.getDestination() + " | " + servicePackage.getService()
				+ " | " + servicePackage.getValue() + " | " + ((priceItem * quantity)+servicePackage.getValue());
	}
}
