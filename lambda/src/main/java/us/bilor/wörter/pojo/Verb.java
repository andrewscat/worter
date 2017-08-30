package us.bilor.wörter.pojo;

public class Verb {

  private String Verb;
  private String[] Translations;
  private String Partizip2;

  public String getVerb() {
    return Verb;
  }

  public void setVerb(String v){
    this.Verb = v;
  }

  public String[] getTranslations() {
    return Translations;
  }

  public void setTranslations(String[] t) {
    this.Translations = t;
  }

  public String getPertizip2() {
    return Partizip2;
  }

  public void setPartizip2(String p) {
    this.Partizip2 = p;
  }
   
}