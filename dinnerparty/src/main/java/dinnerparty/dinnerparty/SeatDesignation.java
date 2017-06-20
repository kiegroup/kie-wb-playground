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

@org.optaplanner.core.api.domain.entity.PlanningEntity
public class SeatDesignation implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private dinnerparty.dinnerparty.Guest guest;
    @org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = {"seatRange"})
    private dinnerparty.dinnerparty.Seat seat;

    private java.lang.Long id;

    public SeatDesignation() {
    }

    public dinnerparty.dinnerparty.Guest getGuest() {
        return this.guest;
    }

    public void setGuest(dinnerparty.dinnerparty.Guest guest) {
        this.guest = guest;
    }

    public dinnerparty.dinnerparty.Seat getSeat() {
        return this.seat;
    }

    public void setSeat(dinnerparty.dinnerparty.Seat seat) {
        this.seat = seat;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public SeatDesignation(dinnerparty.dinnerparty.Guest guest,
                           dinnerparty.dinnerparty.Seat seat,
                           java.lang.Long id) {
        this.guest = guest;
        this.seat = seat;
        this.id = id;
    }
}