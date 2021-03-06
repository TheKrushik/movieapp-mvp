/*
 * Copyright (C) 2018 Shehab Salah
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
package com.shehabsalah.movieappmvp.data.source.remote.response;

import com.shehabsalah.movieappmvp.data.MovieReviews;
import java.util.ArrayList;

/**
 * Created by ShehabSalah on 1/12/18.
 *
 */

public class ReviewsResponse extends GeneralResponse{

    private ArrayList<MovieReviews> results;

    public ReviewsResponse(String result, String message) {
        super(result, message);
    }

    public ArrayList<MovieReviews> getResults() {
        return results;
    }

    public void setResults(ArrayList<MovieReviews> results) {
        this.results = results;
    }
}
