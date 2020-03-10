#!/usr/bin/env python
#-*- coding: utf-8 -*-

# n角形において内角は{180*(n-2)}/n

from turtle import *
from random import randint
import time
start_time = time.time()

speed(0)
setup( width = 1280, height = 720, startx = None, starty = None)
bgcolor("black")
setheading(0)

def mkfig(argu, leng):
	for i in range(n):
		forward(leng)
		left(180 - argu)



# ---------------------------------------------------------------------------

n = 6
arg = 120
len = 40

color('blue')
# begin_fill()
for k in range(96):

  mkfig(arg, len)
  setheading(0 + 15*(k+1))
  len = len * 1.03
# end_fill()
penup()
setposition(-10000,0)

fin_time = time.time() - start_time
print(fin_time)

input('type to exit')