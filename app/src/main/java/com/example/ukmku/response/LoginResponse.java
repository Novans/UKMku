package com.example.ukmku.response;

import com.example.ukmku.model.Data;

import java.util.ArrayList;

public class LoginResponse {

        private Boolean success;

        private Data data;

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }
