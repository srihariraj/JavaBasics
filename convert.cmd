    ffmpeg -i "D:\Videos\Multithreading Part 2.mkv" -b:a 192K -ac 2 -ar 44100 "D:\Videos\Multithreading Part 2.mp3"
    ffmpeg -i "D:\Videos\Multithreading Part 2.mkv" -vf "subtitles=C:\Users\Hp\OneDrive\Desktop\Multithreading-Part 2.srt" final.mkv
