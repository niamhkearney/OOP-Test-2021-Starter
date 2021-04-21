package ie.tudublin;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet {
	String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> note = new ArrayList<Note>();

	public void loadScore() {
		// this variable holds a character from the string until a number is found and
		// if it doesn't it empties itself
		char hold = 0;

		for (int i = 0; i < score.length(); i++) {
			String s = score.substring(i, i + 1);

			int ind = score.indexOf(s);

			// converting the substring to a character
			char ch = score.charAt(ind);

			// checking is the character is a digit or not
			if (Character.isDigit(ch) == true) {

				int num = ch - '0';
				hold = 0;
			} else if (Character.isDigit(ch) == false && hold != 0) {
				// note.add(hold, 1);
				// add character and 1 into the arraylist
			} else {
				hold = ch;
			}

			System.out.println(s);
		}

	}

	public void settings() {
		size(1000, 500);

		// How to convert a character to a number
		// char c = '7'; // c holds the character 7 (55)
		// int i = c - '0'; // i holds the number 7 (55 - 48)
		// println(i);
	}

	public void setup() {
		loadScore();
	}

	public void draw() {
		background(255);

		stroke(0);
		strokeWeight(5);

		for (int i = 250; i < 500; i += 50) {
			line(100, i, 1000, i);
		}

		strokeWeight(2);
		fill(0);
		circle(100, 250, 20);
		line(110, 250, 110, 210);

	}

	void drawNotes() {

	}
}
