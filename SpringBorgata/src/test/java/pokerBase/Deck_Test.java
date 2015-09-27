package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		//	I put this test in so it would pass...
		Deck test = new Deck();
		assertTrue( test.getTotalCards()==52);
	}
	
	@Test
	public void main(){
	
	Card one = new Card( eSuit.HEARTS, eRank.TWO, 0);
	Card two = new Card( eSuit.SPADES, eRank.TWO, 0);
	Card three = new Card( eSuit.HEARTS, eRank.KING, 0);
	Card four = new Card( eSuit.DIAMONDS, eRank.FOUR, 0);
	Card five = new Card( eSuit.HEARTS, eRank.SIX, 0);
	
	Card six = new Card( eSuit.SPADES, eRank.FOUR, 0);
	Card seven = new Card( eSuit.SPADES, eRank.FOUR, 0);
	Card eight = new Card( eSuit.HEARTS, eRank.QUEEN, 0);
	Card nine = new Card( eSuit.DIAMONDS, eRank.ACE, 0);
	Card ten = new Card( eSuit.HEARTS, eRank.THREE, 0);
	
	Hand pair1 = new Hand();
	Hand pair2 = new Hand();
	
	pair1.AddCardToHand(one);
	pair1.AddCardToHand(two);
	pair1.AddCardToHand(three);
	pair1.AddCardToHand(four);
	pair1.AddCardToHand(five);
	
	pair2.AddCardToHand(six);
	pair2.AddCardToHand(seven);
	pair2.AddCardToHand(eight);
	pair2.AddCardToHand(nine);
	pair2.AddCardToHand(ten);
	
	pair1.EvalHand();
	pair2.EvalHand();
	
	assertTrue( Hand.HandRank.compare(pair1, pair2)==-10);
	 
	}

}
