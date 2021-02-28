"""

SIFT
Problem: OpenCV Need to be reinstalled
"""

import cv2
import numpy as np

img=cv2.imread('r.jpg')
gray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)

cv2.imshow('gray',gray)

sift=cv2.SIFT()
kp=sift.detect(gray,None)

img=cv2.drawKeypoints(gray,kp)

cv2.imshow('sift',img)
cv2.imwrite('sift.jpg',img)

if cv2.waitKey(0) & 0xff==27:
    cv2.destroyAllWindows()
print('done')
