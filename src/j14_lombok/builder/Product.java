package j14_lombok.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class Product {
	private Product product;
	
	private int productCode;         //제품코드    : 20220802
	private String productName;	     //제품명      : 스타벅스 텀블러
	private String productCategory;  //제품카테고리: 텀블러
	private String createDate;        //생산일자    : 2022-08-02
	
	
	public static Product builder() {
		return new Product();
		
	}
	
	public Product build() {
		return this;
	}
	
	public Product productCode(int productCode) {
		this.productCode = productCode;
		return this;
	}
	public Product productName(String productName) {
		this.productName = productName;
		return this;
	}
	public Product productCategory(String productCategory) {
		this.productCategory = productCategory;
		return this;
	}
	public Product createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}
	//빌더로 시작해서 빌드로 끝나야함
	
}
