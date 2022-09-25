package lab_06;

public class URLCheck {
    public static void main(String[] args) {
        String url = "https://google.com";

        if(url.contains("https")){
            System.out.println("this url has secure protocol");
        } else if(url.contains("http")){
            System.out.println("this url hasn't secure protocol");
        }

        int startIndex;
        String domainName;

        startIndex = url.lastIndexOf('/') + 1;
        domainName=url.substring(startIndex, url.length());

        System.out.println("domain name is: " + domainName);

        String extension;
        int startIndexExtension = url.indexOf('.');
        extension = url.substring(startIndexExtension, url.length());

        System.out.println("Extension is: " + extension);
    }
}
