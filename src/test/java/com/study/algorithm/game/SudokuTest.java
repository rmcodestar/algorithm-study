package com.study.algorithm.game;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTest {
	private Sudoku sut = new Sudoku();

	@Test
	public void testcase1_easy() {
		int[][] input = {
			{0, 0, 9, 0, 0, 2, 0, 0, 5}
			, {5, 3, 8, 0, 6, 4, 0, 0, 9}
			, {1, 6, 2, 0, 0, 0, 0, 3, 0}
			, {0, 0, 3, 0, 2, 7, 0, 0, 0}
			, {0, 5, 4, 6, 0, 0, 1, 0, 0}
			, {0, 0, 7, 0, 1, 5, 3, 4, 0}
			, {3, 0, 0, 8, 0, 1, 9, 0, 6}
			, {7, 0, 0, 3, 0, 0, 8, 5, 0}
			, {0, 9, 1, 0, 0, 0, 4, 7, 0}
		};

		int[][] output = sut.solve(input); // turn 4

		Assert.assertArrayEquals(output, new int[][] {
			{4, 7, 9, 1, 3, 2, 6, 8, 5}
			, {5, 3, 8, 7, 6, 4, 2, 1, 9}
			, {1, 6, 2, 5, 9, 8, 7, 3, 4}
			, {9, 1, 3, 4, 2, 7, 5, 6, 8}
			, {2, 5, 4, 6, 8, 3, 1, 9, 7}
			, {6, 8, 7, 9, 1, 5, 3, 4, 2}
			, {3, 4, 5, 8, 7, 1, 9, 2, 6}
			, {7, 2, 6, 3, 4, 9, 8, 5, 1}
			, {8, 9, 1, 2, 5, 6, 4, 7, 3}
		});
	}

	@Test
	public void testcase2_normal() {
		int[][] input = {
			{0, 0, 0, 4, 0, 0, 2, 0, 0}
			, {0, 0, 2, 0, 0, 0, 0, 1, 8}
			, {5, 0, 6, 9, 0, 0, 0, 3, 0}
			, {0, 6, 9, 0, 0, 0, 3, 0, 0}
			, {0, 5, 0, 0, 0, 0, 0, 0, 0}
			, {8, 0, 0, 1, 5, 7, 6, 0, 9}
			, {0, 0, 0, 0, 3, 0, 9, 6, 0}
			, {9, 0, 0, 6, 0, 2, 0, 5, 0}
			, {0, 0, 0, 0, 0, 0, 7, 0, 2}
		};

		int[][] output = sut.solve(input); // turn 4
	}

	/**
	 * https://ko.sudokusweb.com/ 2019.03.24
	 * turn: 4
	 */
	@Test
	public void testcase3_very_easy() {
		int[][] input = {
			{5, 6, 4, 0, 0, 2, 0, 7, 8}
			, {0, 0, 9, 1, 8, 0, 5, 0, 6}
			, {0, 8, 1, 0, 0, 5, 3, 9, 2}
			, {0, 2, 6, 0, 0, 1, 9, 3, 0}
			, {0, 9, 0, 5, 0, 4, 2, 1, 7}
			, {1, 5, 0, 0, 2, 0, 0, 0, 0}
			, {0, 0, 3, 4, 0, 6, 7, 2, 0}
			, {0, 7, 5, 2, 1, 0, 4, 6, 0}
			, {6, 0, 0, 0, 0, 3, 8, 5, 0}
		};

		int[][] output = sut.solve(input); // turn 4
		Assert.assertArrayEquals(output, new int[][] {
			{5, 6, 4, 9, 3, 2, 1, 7, 8}
			, {2, 3, 9, 1, 8, 7, 5, 4, 6}
			, {7, 8, 1, 6, 4, 5, 3, 9, 2}
			, {4, 2, 6, 8, 7, 1, 9, 3, 5}
			, {3, 9, 8, 5, 6, 4, 2, 1, 7}
			, {1, 5, 7, 3, 2, 9, 6, 8, 4}
			, {8, 1, 3, 4, 5, 6, 7, 2, 9}
			, {9, 7, 5, 2, 1, 8, 4, 6, 3}
			, {6, 4, 2, 7, 9, 3, 8, 5, 1}
		});
	}

	/**
	 * https://ko.sudokusweb.com/ 2019.03.24
	 * turn: 9
	 */
	@Test
	public void testcase4_easy() {
		int[][] input = {
			{0, 2, 0, 8, 7, 0, 9, 0, 0}
			, {0, 0, 0, 0, 0, 0, 6, 0, 0}
			, {4, 0, 0, 6, 0, 0, 1, 0, 0}
			, {0, 0, 7, 0, 0, 5, 0, 0, 0}
			, {0, 4, 0, 0, 3, 0, 0, 6, 5}
			, {0, 0, 0, 9, 8, 6, 0, 4, 0}
			, {0, 0, 0, 0, 6, 3, 5, 1, 9}
			, {1, 5, 0, 7, 9, 4, 8, 2, 0}
			, {9, 0, 2, 5, 1, 0, 0, 3, 7}
		};

		int[][] output = sut.solve(input);
		Assert.assertArrayEquals(output, new int[][] {
			{3, 2, 6, 8, 7, 1, 9, 5, 4}
			, {5, 7, 1, 3, 4, 9, 6, 8, 2}
			, {4, 9, 8, 6, 5, 2, 1, 7, 3}
			, {6, 1, 7, 4, 2, 5, 3, 9, 8}
			, {8, 4, 9, 1, 3, 7, 2, 6, 5}
			, {2, 3, 5, 9, 8, 6, 7, 4, 1}
			, {7, 8, 4, 2, 6, 3, 5, 1, 9}
			, {1, 5, 3, 7, 9, 4, 8, 2, 6}
			, {9, 6, 2, 5, 1, 8, 4, 3, 7}
		});
	}

	/**
	 * https://ko.sudokusweb.com/ 2019.03.24
	 */
	@Test
	public void testcase5_middle() {
		int[][] input = {
			{0, 0, 0, 0, 9, 0, 0, 0, 0}
			, {0, 0, 5, 0, 4, 0, 6, 0, 3}
			, {0, 7, 0, 0, 0, 0, 0, 4, 0}
			, {3, 0, 2, 0, 0, 0, 0, 6, 4}
			, {0, 0, 0, 1, 2, 5, 0, 0, 7}
			, {0, 0, 8, 0, 3, 0, 0, 1, 0}
			, {5, 9, 7, 0, 1, 0, 0, 0, 0}
			, {1, 0, 6, 2, 5, 4, 0, 0, 0}
			, {2, 0, 0, 0, 0, 7, 0, 8, 5}
		};

		int[][] output = sut.solve(input);
		Assert.assertArrayEquals(output, new int[][] {
			{4, 3, 1, 6, 9, 2, 7, 5, 8}
			, {8, 2, 5, 7, 4, 1, 6, 9, 3}
			, {6, 7, 9, 5, 8, 3, 2, 4, 1}
			, {3, 1, 2, 8, 7, 9, 5, 6, 4}
			, {9, 6, 4, 1, 2, 5, 8, 3, 7}
			, {7, 5, 8, 4, 3, 6, 9, 1, 2}
			, {5, 9, 7, 3, 1, 8, 4, 2, 6}
			, {1, 8, 6, 2, 5, 4, 3, 7, 9}
			, {2, 4, 3, 9, 6, 7, 1, 8, 5}
		});
	}

	/**
	 * https://ko.sudokusweb.com/ 2019.03.24
	 */
	@Test
	public void testcase6_hard() {
		int[][] input = {
			{0, 0, 0, 0, 0, 7, 2, 0, 0}
			, {0, 5, 0, 0, 0, 0, 9, 6, 0}
			, {0, 0, 0, 0, 0, 0, 0, 8, 0}
			, {0, 0, 9, 0, 0, 1, 0, 0, 7}
			, {0, 8, 0, 0, 2, 0, 0, 3, 0}
			, {1, 0, 0, 0, 0, 6, 0, 0, 0}
			, {2, 0, 4, 0, 6, 0, 0, 0, 0}
			, {9, 0, 0, 8, 0, 0, 0, 0, 1}
			, {8, 1, 0, 0, 0, 0, 6, 5, 0}
		};

		int[][] output = sut.solve(input);
		Assert.assertArrayEquals(output, new int[][] {
			  {3, 9, 8, 6, 5, 7, 2, 1, 4}
			, {7, 5, 1, 2, 4, 8, 9, 6, 3}
			, {4, 2, 6, 9, 1, 3, 7, 8, 5}
			, {6, 4, 9, 3, 8, 1, 5, 2, 7}
			, {5, 8, 7, 4, 2, 9, 1, 3, 6}
			, {1, 3, 2, 5, 7, 6, 8, 4, 9}
			, {2, 7, 4, 1, 6, 5, 3, 9, 8}
			, {9, 6, 5, 8, 3, 2, 4, 7, 1}
			, {8, 1, 3, 7, 9, 4, 6, 5, 2}
		});
	}

	@Test
	public void testcase7_very_hard() {
		int[][] input = {
			  {0, 0, 0, 0, 7, 0, 0, 6, 0}
			, {0, 0, 5, 0, 0, 0, 0, 1, 3}
			, {0, 3, 0, 0, 1, 0, 0, 8, 0}
			, {0, 0, 1, 0, 0, 4, 0, 0, 0}
			, {4, 0, 0, 5, 0, 9, 0, 0, 0}
			, {0, 0, 7, 0, 0, 0, 0, 0, 0}
			, {0, 2, 4, 0, 0, 3, 6, 7, 0}
			, {3, 0, 0, 8, 0, 0, 0, 9, 0}
			, {0, 0, 0, 4, 0, 0, 0, 0, 8}
		};

		int[][] output = sut.solve(input);
		Assert.assertArrayEquals(output, new int[][] {
			{1, 4, 8, 3, 7, 5, 9, 6, 2}
			, {6, 9, 5, 2, 4, 8, 7, 1, 3}
			, {7, 3, 2, 9, 1, 6, 5, 8, 4}
			, {9, 8, 1, 7, 2, 4, 3, 5, 6}
			, {4, 6, 3, 5, 8, 9, 1, 2, 7}
			, {2, 5, 7, 6, 3, 1, 8, 4, 9}
			, {8, 2, 4, 1, 9, 3, 6, 7, 5}
			, {3, 7, 6, 8, 5, 2, 4, 9, 1}
			, {5, 1, 9, 4, 6, 7, 2, 3, 8}
		});
	}
}