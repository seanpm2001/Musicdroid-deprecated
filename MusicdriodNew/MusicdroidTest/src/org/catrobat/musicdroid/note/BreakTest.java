/*******************************************************************************
 * Catroid: An on-device visual programming system for Android devices
 *  Copyright (C) 2010-2013 The Catrobat Team
 *  (<http://developer.catrobat.org/credits>)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  An additional term exception under section 7 of the GNU Affero
 *  General Public License, version 3, is available at
 *  http://www.catroid.org/catroid/licenseadditionalterm
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.catrobat.musicdroid.note;

import org.catrobat.musicdroid.note.Break;
import org.catrobat.musicdroid.note.NoteLength;
import junit.framework.TestCase;

public class BreakTest extends TestCase {

	public void testBreak() {
		Break br = new Break(NoteLength.WHOLE);
		
		assertEquals(NoteLength.WHOLE, br.getNoteLength());
	}
	
	public void testEquals1() {
		Break break1 = new Break(NoteLength.HALF);
		Break break2 = new Break(NoteLength.HALF);
		
		assertTrue(break1.equals(break2));
	}
	
	public void testEquals2() {
		Break break1 = new Break(NoteLength.HALF);
		Break break2 = new Break(NoteLength.WHOLE);
		
		assertFalse(break1.equals(break2));
	}
	
	public void testEquals3() {
		Break br = new Break(NoteLength.HALF);
		
		assertFalse(br.equals(null));
	}
	
	public void testEquals4() {
		Break br = new Break(NoteLength.HALF);
		
		assertFalse(br.equals(""));
	}
	
	public void testToString() {
		NoteLength noteLength = NoteLength.WHOLE;
		Break br = new Break(noteLength);
		
		assertEquals("[Break] noteLength=" + noteLength, br.toString());
	}
}
