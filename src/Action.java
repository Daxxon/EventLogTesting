public enum Action {

  FACE2FACE ("Face2Face"),
  PHONECALL ("PhoneCall"),
  TEXTMESSAGING ("TextMessaging"),
  UNKNOWN ("Unknown");

  private String englishName;

  Action (String englishName) {
    this.englishName = englishName;
  }

  public String getEnglishName() {
    return this.englishName;
  }
}
