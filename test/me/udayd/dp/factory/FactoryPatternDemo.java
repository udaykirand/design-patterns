package me.udayd.dp.factory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FactoryPatternDemo {
	
	@Test
	public void testShapeObject() {
		assertThat(ShapeFactory.getShape("SQUARE"), instanceOf(Square.class));
		assertThat(ShapeFactory.getShape("CIRCLE"), instanceOf(Circle.class));
		assertThat(ShapeFactory.getShape("RECTANGLE"), instanceOf(Rectangle.class));
		
		assertThat(ShapeFactory.getShapeFromEnum(ShapeTypeEnum.CIRCLE), instanceOf(Circle.class));
		assertThat(ShapeFactory.getShapeFromEnum(ShapeTypeEnum.SQUARE), instanceOf(Square.class));
		assertThat(ShapeFactory.getShapeFromEnum(ShapeTypeEnum.RECTANGLE), instanceOf(Rectangle.class));
	}

}
