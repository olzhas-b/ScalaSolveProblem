object leetcode13 extends App {
  def dayOfTheWeek(day: Int, month: Int, year: Int): String = {
    var weeks = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
    var months = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    var days = 4;
    for(i <- 1971 until year) {
      if(i % 4 == 0 && i % 100 != 0) {
        days += 366;
      } else if(i % 400 == 0) {
        days += 366;
      } else {
        days += 365;
      }
    }
    for(i <- 1 until month) {
      if(i == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
        days += 1;
      }
      days += months(i - 1);
    }
    days += day;
    return weeks(days % 7);
  }
  def test1(): Unit = {
    // today data is 28/09/2020
    println(dayOfTheWeek(28, 9, 2020));
    // answer: Monday
  }
  test1();
}
