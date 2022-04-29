package Lesson3;

public class Lesson3Part7
{
  public String name1;
  public int idNumber1;
  public String department1;
  public String position1;
  public String name2;
  public  int idNumber2;
  public String department2;
  public String position2;
  public String name3;
  public int  idNumber3;
  public String department3;
  public String position3;

  public void setPerson1(String nam1,int idNum1,String dep1,String pos1)
  {
    name1=nam1;
    idNumber1 = idNum1  ;
    department1 = dep1  ;
    position1 =pos1  ;
  }
  public void setPerson2(String nam2,int idNum2,String dep2,String pos2)
  {
    name2 =nam2 ;
    idNumber2 =idNum2 ;
    department2= dep2 ;
    position2= pos2 ;
  }
  public void setPerson3(String nam3,int idNum3,String dep3,String pos3)
  {
    name3= nam3;
    idNumber3= idNum3 ;
    department3= dep3 ;
    position3 =pos3 ;
  }

  public String getPerson1()
  {
    return "Name" + name1 + "ID:" + idNumber1 + "Department:" + department1 + "Position"+ position1;

  }

  public String getPerson2()
  {
    return "Name" + name2 + "ID:" + idNumber2 + "Department:" + department2 + "Position"+ position2;

  }
  public String getPerson3()
  {
    return "Name" + name3 + "ID:" + idNumber3 + "Department:" + department3 + "Position"+ position3;

  }
}

