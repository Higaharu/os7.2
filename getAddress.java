import java.net.InetAddress;

public class getAddress {
    public static void main(String[] args){
        try{
            InetAddress hostAdd =InetAddress.getLocalHost();
            String hostName = hostAdd.getHostName();
            InetAddress[] addList = InetAddress.getAllByName(hostName);
            for(int i = 0; i<addList.length; i++){
                System.out.println(addList[i].getClass().getSimpleName());
                System.out.println( addList[i] );
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}