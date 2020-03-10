# pof1.pyの描画が繰り返されるやつ



#!/usr/bin/env python
#-*- coding: utf-8 -*-

from turtle import *
from random import randint

def sortn(lst):
	lst.sort()
	return	lst

def appendn(lst, item):
	lst.append(item)
	return	lst

def xline(x_lst):
  for i in range(len(x_lst)):
    penup()
    setx(xlst[i] - 640)
    sety(-360)
    pendown()  
    setheading(90)
    forward(720)

def yline(y_lst):
  for i in range(len(y_lst)):
    penup()
    sety(ylst[i] - 360)
    setx(-640)
    pendown()  
    setheading(0)
    forward(1280)

# --------------------------------------------------
setup( width = 1280, height = 720, startx = None, starty = None)

# 描画回数
for k in range(100):
  

# 縦線、横線の数
  xnum = randint(30, 50)
  ynum = randint(20, 50)

# 縦、横のランダムリスト生成
  xlst = []
  ylst = []

  for i in range(xnum):
	  xlst = appendn(xlst,randint(0, 1280))
  xlst = sortn(xlst)
# print(xlst)

  for i in range(ynum):
	  ylst = appendn(ylst,randint(0, 720))
  ylst = sortn(ylst)
# print(ylst)

# 実行
  speed(0)
  setup( width = 1280, height = 720, startx = None, starty = None)
  bgcolor("gray")
  color("orange")
  xline(xlst)
  penup()
  home()
  yline(ylst)
  resetscreen()