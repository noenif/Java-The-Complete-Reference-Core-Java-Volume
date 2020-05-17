package Chapter_3_Basic_knowledge.enum1;

  /**
    * This program demonstrates enumerated types.
    * @version 1.0 2004-05-24
    * @author Cay Horstmann
    */


          enum Size
  {
             SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
            //构造函数
             private Size(String abbreviation) { this.abbreviation = abbreviation; }
             public String getAbbreviation() { return abbreviation; }

             private String abbreviation;
          }