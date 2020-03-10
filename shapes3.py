# マス目移動



#!/usr/bin/env python
#-*- coding: utf-8 -*-

# x,y固定

from turtle import *
from random import randint

xlst = [a for a in range(0,1281, 32)]
ylst = [a for a in range(0, 721, 18)]
# print(xlst)
# print(ylst)
xlen = len(xlst)
ylen = len(ylst)
# print(xlen, ylen)
speed(0)
setup( width = 1280, height = 720, startx = None, starty = None)
bgcolor("gray")
color("orange")

# XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
for k in range(41):
	penup()
	setx(xlst[k] - 640)
	sety(-360)
	setheading(90)
	pendown()
	for i in range(72):
		if xcor() == -640:
			xrand = randint(1,2) #(1:直進,2:右上)
			if xrand == 1:
				forward(10)
			elif xrand == 2:
				setheading(0)
				forward(10)
				setheading(90)
				forward(10)
		elif xcor() == 640:
			xrand = randint(0,1) #(0:左上,1:直進)
			if xrand == 0:
				setheading(180)
				forward(10)
				setheading(90)
				forward(10)
			elif xrand == 1:
				forward(10)
		else:
			xrand = randint(0,2) #(0:左上,1:直進,2:右上)
			if xrand == 0:
				setheading(180)
				forward(10)
				setheading(90)
				forward(10)
			elif xrand == 1:
				forward(10)
			elif xrand == 2:
				setheading(0)
				forward(10)
				setheading(90)
				forward(10)


# YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY
for j in range(41):
	penup()
	setx(-640)
	sety(ylst[j] - 360)
	setheading(0)
	pendown()
	for i in range(128):
		if ycor() == 360:
			yrand = randint(1,2) #(1:直進,2:右下)
			if yrand == 1:
				forward(10)
			elif yrand == 2:
				setheading(270)
				forward(10)
				setheading(0)
				forward(10)
		elif ycor() == -360:
			yrand = randint(0,1) #(0:右上,1:直進)
			if yrand == 0:
				setheading(90)
				forward(10)
				setheading(0)
				forward(10)
			elif yrand == 1:
				forward(10)
		else:
			yrand = randint(0,2) #(0:右上,1:直進,2:右下)
			if yrand == 0:
				setheading(90)
				forward(10)
				setheading(0)
				forward(10)
			elif yrand == 1:
				forward(10)
			elif yrand == 2:
				setheading(270)
				forward(10)
				setheading(0)
				forward(10)


input('type to exit')