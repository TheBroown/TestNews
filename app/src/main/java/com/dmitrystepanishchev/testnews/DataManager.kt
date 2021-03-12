package com.dmitrystepanishchev.testnews

class DataManager {

    fun getNews(): ArrayList<News> {
        val news = ArrayList<News>()
        news.add(
            News(
                "Dec. 26, 2017",
                "We released new AR game for iOS - AR Darts One. Play it with your favorite enemy photo on dartboard in any of 3 game modes available and try to beat records."
            )
        )
        news.add(
            News(
                "Oct. 31, 2017",
                "AR Basketball One with major update have been released. A new game ball and ballboard skins are available now."
            )
        )
        news.add(
            News(
                "Sept. 20, 2017",
                "Meet new game by Verysoft AR Basketball One with impressive technology of Augmented Reality for iPhone and iPad!"
            )
        )
        news.add(
            News(
                "Oct. 21, 2015",
                "New version of AllProxy published - 2.6.735. Added DNS proxifying, Windows 10 support. Other fixes and improvements."
            )
        )
        news.add(
            News(
                "July 17, 2014",
                "New version of AllProxy published - 2.5.723. Improvements in support of Modern UI/Metro applications in Windows 8. Other fixes and improvements."
            )
        )
        news.add(
            News(
                "May 26, 2014",
                "New version of AllProxy published - 2.4.710. Added proxifying Modern UI/Metro applications in Windows 8. Other fixes and improvements."
            )
        )
        news.add(
            News(
                "June 16, 2013",
                "The Princess again was captured by the evil Dragon! Help Knight to save his Princess!"
            )
        )
        news.add(
            News(
                "April 15, 2013",
                "New version of AllProxy published - 2.3.685. Added new features for command-line mode: setting application working directory and returning proxified application result code."
            )
        )
        news.add(
            News(
                "March 1, 2013",
                "New version of AllProxy published - 2.3.684. Fixed proxification of latest mIRC and Flash."
            )
        )
        news.add(
            News(
                "Jan. 5, 2013",
                "May this year be the one in which all your wishes come true. The one in which your dreams may turn into reality and all your fears may fade away. Happy new year!",
                "Happy New Year 2013!"
            )
        )
        news.add(
            News(
                "Dec. 21, 2012",
                "Published workaround to fix AllProxy on Windows 8. Metro applications now works but with no proxification."
            )
        )
        news.add(
            News(
                "Aug. 30, 2012",
                "WebCamSplitter 1.5 released. No more questions about additional resolutions! Please, check it out. We're waiting for your feeadback."
            )
        )
        news.add(
            News(
                "May 22, 2012",
                "AllProxy updated again! New version 2.3 supports new cool feature - Connection logging. Stay tuned and get latest update. Update for registered users is free."
            )
        )
        news.add(
            News(
                "March 5, 2012",
                "Good against evil… Two opposie sides… Which of them dominates? New stunning animated theme released."
            )
        )
        news.add(
            News(
                "Feb. 17, 2012",
                "Great news for Samsung mobile owners! We've just released 4 themes: You're my Valentine , Inseparable Hearts, Lovely Valentine , Lovely Teddy."
            )
        )
        news.add(
            News(
                "Jan. 23, 2012",
                "We are pleased to announce new versions of WebCamSplitter Standard and Pro — 1.4. Here you can find changelog. Among new features: online registration, Picture-in-Picture, and even more! Stay tuned and get latest update. Update for registered users is free."
            )
        )
        news.add(
            News(
                "March 12, 2021",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?",
                "TestScrollInNews"
            )
        )
        return news
    }
}

