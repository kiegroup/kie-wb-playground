/**
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dinnerparty.dinnerparty;

public class Seat implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private dinnerparty.dinnerparty.Table table;
    private int seatIndexInTable;
    private dinnerparty.dinnerparty.Seat leftSeat;
    private dinnerparty.dinnerparty.Seat rightSeat;

    private java.lang.Long id;

    public Seat() {
    }

    public dinnerparty.dinnerparty.Table getTable() {
        return this.table;
    }

    public void setTable(dinnerparty.dinnerparty.Table table) {
        this.table = table;
    }

    public int getSeatIndexInTable() {
        return this.seatIndexInTable;
    }

    public void setSeatIndexInTable(int seatIndexInTable) {
        this.seatIndexInTable = seatIndexInTable;
    }

    public dinnerparty.dinnerparty.Seat getLeftSeat() {
        return this.leftSeat;
    }

    public void setLeftSeat(dinnerparty.dinnerparty.Seat leftSeat) {
        this.leftSeat = leftSeat;
    }

    public dinnerparty.dinnerparty.Seat getRightSeat() {
        return this.rightSeat;
    }

    public void setRightSeat(dinnerparty.dinnerparty.Seat rightSeat) {
        this.rightSeat = rightSeat;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public Seat(dinnerparty.dinnerparty.Table table,
                int seatIndexInTable,
                dinnerparty.dinnerparty.Seat leftSeat,
                dinnerparty.dinnerparty.Seat rightSeat,
                java.lang.Long id) {
        this.table = table;
        this.seatIndexInTable = seatIndexInTable;
        this.leftSeat = leftSeat;
        this.rightSeat = rightSeat;
        this.id = id;
    }
}