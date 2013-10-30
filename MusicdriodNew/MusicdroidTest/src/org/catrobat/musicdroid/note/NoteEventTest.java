/**
 *  Catroid: An on-device visual programming system for Android devices
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
 *  http://developer.catrobat.org/license_additional_term
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.musicdroid.note;

import junit.framework.TestCase;

public class NoteEventTest extends TestCase {

	public void testNoteEvent() {
		NoteName noteName = NoteName.C1;
		long tick = 64;
		boolean noteOn = false;

		NoteEvent noteEvent = new NoteEvent(noteName, tick, noteOn);

		assertEquals(noteName, noteEvent.getNoteName());
		assertEquals(tick, noteEvent.getTick());
		assertEquals(noteOn, noteEvent.isNoteOn());
	}

	public void testEquals1() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, true);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C1, 0, true);

		assertTrue(noteEvent1.equals(noteEvent2));
	}

	public void testEquals2() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, true);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C2, 0, true);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals3() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, true);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C1, 64, true);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals4() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, true);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C1, 0, false);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals5() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, false);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C2, 64, false);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals6() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, false);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C2, 0, true);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals7() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, false);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C1, 64, true);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals8() {
		NoteEvent noteEvent1 = new NoteEvent(NoteName.C1, 0, false);
		NoteEvent noteEvent2 = new NoteEvent(NoteName.C2, 64, true);

		assertFalse(noteEvent1.equals(noteEvent2));
	}

	public void testEquals9() {
		NoteEvent noteEvent = new NoteEvent(NoteName.C1, 0, true);

		assertFalse(noteEvent.equals(null));
	}

	public void testEquals10() {
		NoteEvent noteEvent = new NoteEvent(NoteName.C1, 0, true);

		assertFalse(noteEvent.equals(""));
	}

	public void testToString() {
		NoteName noteName = NoteName.C1;
		long tick = 64;
		boolean noteOn = false;

		NoteEvent noteEvent = new NoteEvent(noteName, tick, noteOn);

		assertEquals("[NoteEvent] noteName= " + noteName + " tick=" + tick + " noteOn=" + noteOn, noteEvent.toString());
	}
}
