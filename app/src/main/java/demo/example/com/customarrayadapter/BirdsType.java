package demo.example.com.customarrayadapter;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by poornima-udacity on 6/26/15.
 */
public class BirdsType implements Parcelable {
    String BirdName;
    String BirdFamily;
    int image; // drawable reference id
    String Description;
    //int pic1,pic2,pic3;
    int[] pics;
    String color;
    String area;

    public BirdsType(String vName, String vNumber, int image,String Description,int[] pics,String color,String area)
    {
        this.BirdName = vName;
        this.BirdFamily = vNumber;
        this.image = image;
        this.Description=Description;
        this.pics = pics;
        this.color = color;
        this.area = area;
//        this.pic1 = pic1;
//        this.pic2 = pic2;
//        this.pic3 = pic3;
    }
    private BirdsType(Parcel in){
        BirdName=in.readString();
        BirdFamily=in.readString();
        image = in.readInt();
        Description = in.readString();
        pics = in.createIntArray();
        color=in.readString();
        area=in.readString();
/*        pic1 = in.readInt();
        pic2 = in.readInt();
        pic3 = in.readInt();*/

    }
    @Override
    public int describeContents() {
        return 0;
    }
    public String toString() { return BirdName + "--" + BirdFamily + "--" + image; }
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(BirdName);
        parcel.writeString(BirdFamily);
        parcel.writeInt(image);
        parcel.writeString(Description);
        parcel.writeIntArray(pics);
        parcel.writeString(color);
        parcel.writeString(area);
        /*parcel.writeInt(pic1);
        parcel.writeInt(pic2);
        parcel.writeInt(pic3);*/
    }
    public final Parcelable.Creator<BirdsType> CREATOR = new Parcelable.Creator<BirdsType>() {
        @Override
        public BirdsType createFromParcel(Parcel parcel) {
            return new BirdsType(parcel);
        }
        @Override
        public BirdsType[] newArray(int i) {
            return new BirdsType[i];
        }
    };
}