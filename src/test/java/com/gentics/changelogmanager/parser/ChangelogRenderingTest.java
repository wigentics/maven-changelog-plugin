package com.gentics.changelogmanager.parser;

import net.sf.textile4j.Textile;

import org.junit.Test;

import com.github.rjeschke.txtmark.Processor;

public class ChangelogRenderingTest {

	@Test
	public void testRendering() {
		Textile textile = new Textile();
		String testText = "\"linktext\":http://www.jotschi.de";
		System.out.println(textile.process(testText));
		testText = "[This link](http://example.net/)";
		System.out.println(Processor.process(testText));

	}
	
	@Test
	public void testRenderingParagraphs() {
		Textile textile = new Textile();
		String testText = "This is a text\nWith\nLots\nof\nnewlines\n\nBut only one empty line\nJow\n";
		System.out.println(textile.process(testText));
	}
}
