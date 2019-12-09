package com.maxtrain.bootcamp.prs.lineitem;

//import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;



public interface LineItemRepository extends JpaRepository<LineItem, Integer>{

	Iterable<LineItem> getLineItemByRequestId(Integer requestId);
	//Collection<LineItem> findLineItemByRequestIdIn(Integer requestId);
	
}
