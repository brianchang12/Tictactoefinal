package com.bcapp.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private boolean isPlayerOneTurn;
    private Tile[][] tiles;
    private int counter;
    private TextView turn;
    private int x;
    private int y;
    private Stack<Tile> stack_view;
    private boolean game_over;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=0;
        y=0;
        stack_view = new Stack<>();
        counter = 1;
        tiles = new Tile[3][3];
        isPlayerOneTurn = true;
        turn = findViewById(R.id.turnid);
        game_over = false;
        turn.setText("Player 1's Turn");

        tiles[0][0] = new Tile((TextView) findViewById(R.id.coord00));
        tiles[1][0] = new Tile((TextView) findViewById(R.id.coord10));
        tiles[2][0] = new Tile((TextView) findViewById(R.id.coord20));

        tiles[0][1] = new Tile((TextView) findViewById(R.id.coord01));
        tiles[1][1] = new Tile((TextView) findViewById(R.id.coord11));
        tiles[2][1] = new Tile((TextView) findViewById(R.id.coord21));

        tiles[0][2] = new Tile((TextView) findViewById(R.id.coord02));
        tiles[1][2] = new Tile((TextView) findViewById(R.id.coord12));
        tiles[2][2] = new Tile((TextView) findViewById(R.id.coord22));

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].getTextView().setOnTouchListener(this);
            }
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch(v.getId()) {
            case R.id.coord00:
                x = 0;
                y = 0;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");
                }
                if (counter >= 4) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }

                break;
            case R.id.coord10:
                x = 1;
                y = 0;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord20:
                x = 2;
                y = 0;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord01:
                x = 0;
                y = 1;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord02:
                x = 0;
                y = 2;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord11:
                x = 1;
                y = 1;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord12:
                x = 1;
                y = 2;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord21:
                x = 2;
                y = 1;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;
            case R.id.coord22:
                x = 2;
                y = 2;
                if (tiles[x][y].getOccupied_o() || tiles[x][y].getOccupied_x()) {
                    return true;
                }
                textHandler(isPlayerOneTurn, x, y);
                if (isPlayerOneTurn) {
                    turn.setText("Player 2's Turn");

                } else {
                    turn.setText("Player 1's Turn");

                }
                if (counter >= 5) {
                    if(isPlayerOneTurn) {
                        winHandlerOne();
                    } else {
                        winHandlerTwo();
                    }

                }
                break;

        }
        if (isPlayerOneTurn) {
            isPlayerOneTurn = false;
        } else {
            isPlayerOneTurn = true;
        }
        counter++;
        stack_view.push(tiles[x][y]);
        if (counter == 10 && game_over == false) {
            turn.setText("Tie");
            game_over = true;
        }
        return true;
    }


    public void winHandlerTwo() {

        if (tiles[0][0].getOccupied_o() && tiles[1][0].getOccupied_o() && tiles[2][0].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[0][1].getOccupied_o() && tiles[1][1].getOccupied_o() && tiles[2][1].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[0][2].getOccupied_o() && tiles[1][2].getOccupied_o() && tiles[2][2].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[0][0].getOccupied_o() && tiles[0][1].getOccupied_o() && tiles[0][2].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[1][0].getOccupied_o() && tiles[1][1].getOccupied_o() && tiles[1][2].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[2][0].getOccupied_o() && tiles[2][1].getOccupied_o() && tiles[2][2].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[0][0].getOccupied_o() && tiles[1][1].getOccupied_o() && tiles[2][2].getOccupied_o()) {
            playerTwoWin();
            return;
        }
        if (tiles[2][0].getOccupied_o() && tiles[1][1].getOccupied_o() && tiles[0][2].getOccupied_o()) {
            playerTwoWin();
            return;
        }
    }

    private void playerTwoWin() {
        turn.setText("Player 2 Wins");

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].getTextView().setOnTouchListener(null);
            }
        }
        game_over = true;

    }

    public void winHandlerOne() {

            if (tiles[0][0].getOccupied_x() && tiles[1][0].getOccupied_x() && tiles[2][0].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[0][1].getOccupied_x() && tiles[1][1].getOccupied_x() && tiles[2][1].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[0][2].getOccupied_x() && tiles[1][2].getOccupied_x() && tiles[2][2].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[0][0].getOccupied_x() && tiles[0][1].getOccupied_x() && tiles[0][2].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[1][0].getOccupied_x() && tiles[1][1].getOccupied_x() && tiles[1][2].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[2][0].getOccupied_x() && tiles[2][1].getOccupied_x() && tiles[2][2].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[0][0].getOccupied_x() && tiles[1][1].getOccupied_x() && tiles[2][2].getOccupied_x()) {
                playerOneWin();
                return;
            }
            if (tiles[2][0].getOccupied_x() && tiles[1][1].getOccupied_x() && tiles[0][2].getOccupied_x()) {
                playerOneWin();
                return;
            }

        }

    public void playerOneWin() {
        turn.setText("Player 1 Wins");

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].getTextView().setOnTouchListener(null);
            }
        }

        game_over = true;
    }


    public void textHandler(boolean isPlayerOneTurn, int x, int y) {

        if (isPlayerOneTurn) {
            tiles[x][y].getTextView().setText("X");
            tiles[x][y].setOccupied_x(true);

        } else {
            tiles[x][y].getTextView().setText("O");
            tiles[x][y].setOccupied_o(true);

        }
    }

    public void newGame(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
        startActivity(intent);
    }

    public void goBack(View view) {
        if (game_over) {
            return;
        }
        if (stack_view.size() > 0) {
            Tile temp = stack_view.pop();
            counter--;
            temp.getTextView().setText("");
            if (isPlayerOneTurn) {
                isPlayerOneTurn = false;
                turn.setText("Player 2's Turn");

                temp.setOccupied_o(false);

            } else {
                isPlayerOneTurn = true;
                turn.setText("Player 1's Turn");

                temp.setOccupied_x(false);


            }


        } else {
            return;
        }
    }
}
