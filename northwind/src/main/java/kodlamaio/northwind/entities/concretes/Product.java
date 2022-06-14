package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name="products")
@Entity
@Data
public class Product {
	@Id
	@GeneratedValue
	@Column(name="product_id")
private int id;
	@Column(name="category_id")
private int categoryId;
	@Column(name="product_name")
private String ProductName;
	@Column(name="unit_price")
private double unitPrice;
	@Column(name="units_in_stock")
private short unıtsInStock;
	@Column(name="quantity_per_unit")
private String quantityPerUnit;

	public Product() {}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unıtsInStock,
		String quantityPerUnit) {
	super();
	this.id = id;
	this.categoryId = categoryId;
	ProductName = productName;
	this.unitPrice = unitPrice;
	this.unıtsInStock = unıtsInStock;
	this.quantityPerUnit = quantityPerUnit;
}

}
