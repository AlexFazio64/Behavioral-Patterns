package pattern.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import pattern.iterator.ElementType1;
import pattern.iterator.ElementType2;
import pattern.iterator.GenericIterator;
import pattern.iterator.UnorganizedCollection;

public class RootController {
	public HBox hbox;
	UnorganizedCollection collection;
	GenericIterator it1;
	GenericIterator it2;
	
	public void initialize() {
		collection = new UnorganizedCollection();
		collection.add(new ElementType2());
		collection.add(new ElementType1());
		collection.add(new ElementType1());
		collection.add(new ElementType2());
		collection.add(new ElementType2());
		collection.add(new ElementType1());
		collection.add(new ElementType2());
		collection.add(new ElementType1());
		collection.add(new ElementType1());
		collection.add(new ElementType2());
		collection.add(new ElementType1());
		collection.add(new ElementType1());
		
		for (int i = 0; i < collection.size(); ++i)
			hbox.getChildren().add(collection.get(i));
		
		it1 = collection.getIteratorType1();
		it2 = collection.getIteratorType2();
	}
	
	public void next1(ActionEvent actionEvent) {
		if ( it1.hasMore() ) {
			it1.next().visit("#5459BF");
		}
	}
	
	public void next2(ActionEvent actionEvent) {
		if ( it2.hasMore() ) {
			it2.next().visit("#8BBFA7");
		}
	}
	
	public void clear(ActionEvent actionEvent) {
		collection.reset();
		it1 = collection.getIteratorType1();
		it2 = collection.getIteratorType2();
	}
}
