Grade-Dropping-101
==================

This problem is from a programming competition.

Lots of top programmers couldn't figure it out, but it only requires basic commands and info, and it's somewhat short (not too short, of course).

"COLLEGIATE PROGRAMMING COMPETITION, 2006"
"Grade Dropping 101"
Consider a college course [not cs107] in which students are allowed to drop scores for up to 3 course assignments. But, students are allowed to drop scores for up to 3 course assignments. But, sutdents have to choos which ones to drop, to yield the highest maximum score.

This program, given a list of assignment results, will calculate the best assignment percentage grade that can be obtained by dropping three of the assignments.
[WARNING: You do NOT necessarily get it by dropping the lowest-percent assignments!]
 
EXAMPLE:
Consider these assignment scores:
* 41 points out of 42
* 22 pts out of 64
* 2 pts out of 26
* 11 pts out of 44
* 24 pts out of 27
* 26 pts out of 70
* 4 pts out of 30
 
The grade percentage when dropping zero assignments is:
(41+22+2+11+24+26+4) / (42+64+26+44+27+70+30) = 42.9%
 
But, you could improve that percentage, by choosing 3 scores to drop.
What is the maximum percentage possible, by dropping 3 scores?
(In this case, it is 56.8%)
 
INPUT:
Input to your program is:
* The number of assignments.  (This is at least 4, and at most 30.)
* The student's scores, and the maximum points, one at a time,
  for each of the assignments.
  (Scores are at least 0, and at most the maximum.)
  (The maximum scores at least 1, and at most 100.)
 
OUTPUT:
* The best possible final assignment percentage, from dropping 3 scores.

---------------------------------------------------------------------------------------------------------------------

SAMPLE INPUTS, TO TEST YOUR PROGRAM:
=====================================================================================================================

JoseMtz% java challenge

Input number of assignments: <-----say user types 4

Input students score: <-----say user types 7

Input the max score: <------say user types 48

Input students score: <-----say user types 0

Input the max score: <------say user types 83

Input students score: <-----say user types 59

Input the max score: <------say user types 76

Input students score: <-----say user types 13

Input the max score: <------say user types 100

Best possible percentage: 77.6% <----short for ease, it is really 77.63157894736842, but consider yourself right if you get 77.6....

EXTRA SAMPLE RESULT, WHEN CONFIRMING YOUR PROGRAM IS CORRECT:
With 30 assignments:
0/30, 19/99, 44/74, 24/46, 19/21, 71/77, 34/49, 43/59, 16/39, 25/33, 22/82, 19/85, 11/88, 32/65, 1/88, 48/51, 9/43
48/60, 14/25, 23/65, 42/48, 43/97, 14/33, 9/48, 81/93, 3/85, 9/98, 19/86, 9/98, 57/60
Correct output is:
48.1% <--- short for ease, here, correct output is really 48.08043875685558
