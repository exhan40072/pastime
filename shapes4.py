# 正n角形の回転した図


#!/usr/bin/env python
#-*- coding: utf-8 -*-

# n角形において内角は{180*(n-2)}/n

from turtle import *
from random import randint

speed(0)
setup( width = 1280, height = 720, startx = None, starty = None)
bgcolor("gray")
color("orange")
setheading(0)

def mkfig(argu, leng):
	for i in range(n):
		forward(leng)
		left(180 - argu)



# ---------------------------------------------------------------------------


n = randint(3,10)
arg = (180*(n-2))/n
# print(n)
# print(ang)
len = [0,0,0,380,250,190,155,131,114,101,90]
# len = 10
len = len[n]

for k in range(36):

	# len = (15)*1.01*k
	mkfig(arg, 50)
	setheading(0 + 10*(k+1))
	# resetscreen()

# penup()
# setposition(320, 180)
# pendown()
# for k in range(36):

# 	# len = (15)*1.01*k
# 	mkfig(arg, len)
# 	setheading(0 + 10*(k+1))

# penup()
# setposition(320, -180)
# pendown()
# for k in range(36):

# 	# len = (15)*1.01*k
# 	mkfig(arg, len)
# 	setheading(0 + 10*(k+1))

# penup()
# setposition(-320, 180)
# pendown()
# for k in range(36):

# 	# len = (15)*1.01*k
# 	mkfig(arg, len)
# 	setheading(0 + 10*(k+1))

# penup()
# setposition(-320, -180)
# pendown()
# for k in range(36):

# 	# len = (15)*1.01*k
# 	mkfig(arg, len)
# 	setheading(0 + 10*(k+1))

input('type to exit')