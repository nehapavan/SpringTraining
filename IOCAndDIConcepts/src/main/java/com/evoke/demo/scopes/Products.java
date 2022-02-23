package com.evoke.demo.scopes;

import com.example.demo.DependencyConcepts.ProductCompany;

public class Products {

	ProductCompany productCompany;

	public Products(ProductCompany productCompany) {
		super();
		this.productCompany = productCompany;
	}

	public void setProductCompany(ProductCompany productCompany) {
		this.productCompany = productCompany;
	}

}
