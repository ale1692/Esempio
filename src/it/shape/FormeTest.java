package it.shape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FormeTest {

	private Quadrato q;
	private Cerchio c;
	private Rettangolo r;
	private Canvas canvas;

	/**
	 * TestLIST
	 * 
	 * >>>> 1) Aggiunta di una forma al canvas XXXXXXXX
	 * 2) Contare le forme nel canvas XXXXXXXX
	 * 3) Calcolare l'area della forma XXXXXXXXX
	 * 4) Calcolare il perimetro della forma
	 * 5) Verificare che una forma è aggiunta al canvas XXXXXXXX
	 * 6) Calcolare l'area complessiva nel canvas XXXXXXX
	 * 7) Calcolare il perimetro complessivo nel canvas
	 * 
	 * 
	 * @throws Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		q = new Quadrato(2);
		c = new Cerchio(3);
		r = new Rettangolo(2,3);
		canvas = new Canvas();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldAddAShapeToCanvas() {
		
		canvas.add(q);
		
		// Write Assert First
		assertEquals("C'è una forma nel canvas", 1, canvas.size());
			
		canvas.add(c);
		canvas.add(r);
		
		// Triangolazione
		assertEquals("Ci sono tre forme nel canvas", 3, canvas.size());
		// Triangolazione
		assertTrue("Il canvas contiene il rettangolo", canvas.contains(r));
		assertTrue("Il canvas contiene il quadrato", canvas.contains(q));
		assertTrue("Il canvas contiene il cerchio", canvas.contains(c));		
		
	}
	
	@Test
	public void shouldCalculateAreaOnShape() {
				
		assertTrue("L'area del quadrato è non nulla", q.calcolaArea()>0);
		assertTrue("L'area del cerchio è non nulla", r.calcolaArea()>0);
		assertTrue("L'area del rettangolo è non nulla", c.calcolaArea()>0);
		
		// Triangolazione
		assertEquals("L'area del quadrato è 4", 4, q.calcolaArea());
		assertEquals("L'area del cerchio è 27", 27, c.calcolaArea());
		assertEquals("L'area del rettangolo è 6", 6, r.calcolaArea());		
		
	}
	
	@Test
	public void shouldCalculateAreaOnCanvas() {
				
		canvas.add(c);
		canvas.add(q);
		canvas.add(r);
		
		assertTrue("Il canvas contiene delle forme", canvas.size()>0);
		
		assertTrue("Il canvas ha area non nulla", canvas.calcolaArea()>0);
		// Triangulate
		// Evident Data
		assertEquals("Il canvas deve avere area 4+27+6", 4+27+6, canvas.calcolaArea());
		
	}
	
	@Test
	public void shouldAddTriangles() {
		
		Triangolo t = new Triangolo(3, 4);
		canvas.add(t);
		
		assertEquals("C'è una forma nel canvas", 1, canvas.size());
		assertEquals("L'area del triangolo è 3*4/2", 3*4/2, t.calcolaArea());
		assertEquals("Il canvas deve avere area 3*4/2", 3*4/2, canvas.calcolaArea());
		
		
	}

}
