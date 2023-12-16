# LeetCode Challenge D1

## Overview
Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [657.  Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given a robot starting at the origin (0, 0) on a 2D plane, determine if it returns to the origin after a sequence of moves (`R`, `L`, `U`, `D`). The orientation is irrelevant, and each move has the same magnitude. Return `true` if the robot returns to the origin, `false` otherwise.

**Example**
> **Input:** moves = "UD"
> **Output:** true
> **Explanation**: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.

**Constraints**
-   `1 <= moves.length <= 2 * 104`
-   `moves`  only contains the characters  `'U'`,  `'D'`,  `'L'`  and  `'R'`.

**Language Used**
> Java

**Difficulty**
>Easy

## Solution Overview
The goal is to check if a robot, starting from the origin, returns to the origin after a sequence of moves. Initially, a straightforward approach of counting left-right and up-down moves seems logical. However, issues arise when there are imbalanced moves at different parts of the sequence.

To address this, we use two counters, `LR_Present` and `UD_Present`, to keep track of the net left-right and up-down movements. For each 'L', we increase `LR_Present`; for 'R', we decrease it. Similarly, 'U' increases `UD_Present`, and 'D' decreases it.

By going through the entire move sequence, these counters accumulate the net effect of left-right and up-down movements. If both counters end up at zero, it means that for every left, there was a corresponding right, and for every up, there was a corresponding down. This ensures the robot returns to the origin, and the function returns `true`. Otherwise, it returns `false`.
