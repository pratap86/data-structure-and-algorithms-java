package com.pratap.interview.questions.string;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class DeleteAnElementFromArrayTest {

	@Test
	void testDelete() {

		int[] givenArray = {1, 2, 3, 4, 5};
		
		int[] expected = DeleteAnElementFromArray.delete(givenArray, 3);
		
		assertAll(
				() -> assertEquals(expected[0], 1),
				() -> assertEquals(expected[1], 2),
				() -> assertEquals(expected[2], 4),
				() -> assertEquals(expected[3], 5)
				);
		assertNotEquals(expected[2], 3);
	}

}
