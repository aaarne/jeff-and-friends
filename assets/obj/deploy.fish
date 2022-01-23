cp *.obj ../../app/src/main/assets/models/

for f in *.jpg
	convert $f -resize 1024x1024 -transparent black ../../app/src/main/assets/models/$f.png
end
	
