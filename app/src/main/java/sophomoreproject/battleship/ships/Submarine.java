package sophomoreproject.battleship.ships;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import sophomoreproject.battleship.R;

/**
 * Created by isaac on 1/31/2018.
 */

public class Submarine extends Ship{

    public Submarine(Context context, int row, int column)
    {
        super(context, row, column);
        setName("submarine");
        setShipSize(3);
        setShipCost(2);
        setdamage(300);
        setDamageCost(1);
        setRange(3);
        setFrange(5);
        setpmove(0);
        setpShots(0);
        setnShots(1);
        setnMove(3);
        setHitpoints(1400);
        shipBox = new Rect(0, 0, 128*getShipSize(), 128);
        shipImage = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.submarine), 128*getShipSize(), 128, false);
    }


}
