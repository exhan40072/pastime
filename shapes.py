# 一画面描画
# 横128ずつ、縦72ずつの本数の単純格子
# 座標入力で線を引く
  # →リストで動かす

#!/usr/bin/env python
#-*- coding: utf-8 -*-

# 1280*720 / 左上（-640, 360）, 右上（640, 360）, 左下（-640, -360）, 右下（640, -360）
# 最初なのでスマートじゃない文

from turtle import *

# 縦線を入れたいx座標のリストを入れると1280*720の縦線を書く関数
# 例：x = [0, 320, 640, 960, 1280]
# yは-360
def xline(x_lst):
  for i in range(len(x_lst)):
    penup()
    setx(x[i] - 640)
    sety(-360)
    pendown()  
    setheading(90)
    forward(720)

# 同じことをyで５本
# xは-640
def yline(y_lst):
  for i in range(len(y_lst)):
    penup()
    sety(y[i] - 360)
    setx(-640)
    pendown()  
    setheading(0)
    forward(1280)


# 本コード
x = [0, 320, 640, 960, 1280]
y = [0, 180, 360, 540, 720]

speed(5)
setup( width = 1280, height = 720, startx = None, starty = None)
color("black")
xline(x)
penup()
home()
yline(y)


input('type to exit')