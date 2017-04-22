package xyz.javecs.test

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import xyz.javecs.tools.expr.eval
import kotlin.test.assertEquals

@ActiveProfiles("test")
@RunWith(SpringRunner::class)
@SpringBootTest
class CalcBotApplicationTest {

	@Test fun evalAdd() {
		assertEquals(7, eval("3+4"))
	}

}